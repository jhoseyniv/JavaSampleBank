//package listsamples;
//
//   /*
//   *  Licensed to the Apache Software Foundation (ASF) under one or more
//    *  contributor license agreements.  See the NOTICE file distributed with
//    *  this work for additional information regarding copyright ownership.
//    *  The ASF licenses this file to You under the Apache License, Version 2.0
//    *  (the "License"); you may not use this file except in compliance with
//    *  the License.  You may obtain a copy of the License at
//    *
//    *     http://www.apache.org/licenses/LICENSE-2.0
//    *
//    *  Unless required by applicable law or agreed to in writing, software
//   *  distributed under the License is distributed on an "AS IS" BASIS,
//   *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//   *  See the License for the specific language governing permissions and
//   *  limitations under the License.
//   */
//   
//   
//   import java.io.IOException;
//   import java.io.ObjectInputStream;
//   import java.io.ObjectOutputStream;
//   import java.io.ObjectStreamField;
//   import java.io.Serializable;
//   import java.lang.reflect.Array;
//import java.util.RandomAccess;
//
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
//   
//   //import org.apache.harmony.luni.internal.nls.Messages;
//   
//   /**
//    * ArrayList is an implementation of {@link List}, backed by an array. All
//    * optional operations adding, removing, and replacing are supported. The
//    * elements can be any objects.
//    * 
//    * @since 1.2
//    */
//   public class ArrayList<E> extends AbstractList<E> implements List<E>,
//           Cloneable, Serializable, RandomAccess {
//   
//       private static final long serialVersionUID = 8683452581122892189L;
//   
//       private transient int firstIndex;
//   
//       private transient int lastIndex;
//   
//       private transient E[] array;
//   
//       /**
//        * Constructs a new instance of {@code ArrayList} with ten capacity.
//        */
//       public ArrayList() {
//           this(10);
//       }
//   
//       /**
//        * Constructs a new instance of {@code ArrayList} with the specified
//        * capacity.
//        * 
//        * @param capacity
//        *            the initial capacity of this {@code ArrayList}.
//        */
//       public ArrayList(int capacity) {
//           if (capacity < 0) {
//               throw new IllegalArgumentException();
//           }
//          firstIndex = lastIndex = 0;
//           array = newElementArray(capacity);
//       }
//   
//       /**
//        * Constructs a new instance of {@code ArrayList} containing the elements of
//        * the specified collection. The initial size of the {@code ArrayList} will
//        * be 10% higher than the size of the specified collection.
//        * 
//        * @param collection
//       *            the collection of elements to add.
//        */
//       public ArrayList(Collection<? extends E> collection) {
//           firstIndex = 0;
//           Object[] objects = collection.toArray();
//           int size = objects.length;
//           array = newElementArray(size + (size / 10));
//           System.arraycopy(objects, 0, array, 0, size);
//           lastIndex = size;
//           modCount = 1;
//       }
//   
//       @SuppressWarnings("unchecked")
//       private E[] newElementArray(int size) {
//           return (E[]) new Object[size];
//       }
//   
//       /**
//        * Inserts the specified object into this {@code ArrayList} at the specified
//        * location. The object is inserted before any previous element at the
//        * specified location. If the location is equal to the size of this
//        * {@code ArrayList}, the object is added at the end.
//        * 
//        * @param location
//        *            the index at which to insert the object.
//        * @param object
//        *            the object to add.
//        * @throws IndexOutOfBoundsException
//        *             when {@code location < 0 || > size()}
//        */
//       @Override
//       public void add(int location, E object) {
//107           int size = lastIndex - firstIndex;
//108           if (0 < location && location < size) {
//109               if (firstIndex == 0 && lastIndex == array.length) {
//110                   growForInsert(location, 1);
//111               } else if ((location < size / 2 && firstIndex > 0)
//112                       || lastIndex == array.length) {
//113                   System.arraycopy(array, firstIndex, array, --firstIndex,
//114                           location);
//115               } else {
//116                   int index = location + firstIndex;
//117                   System.arraycopy(array, index, array, index + 1, size
//118                           - location);
//119                   lastIndex++;
//120               }
//121               array[location + firstIndex] = object;
//122           } else if (location == 0) {
//123               if (firstIndex == 0) {
//124                   growAtFront(1);
//125               }
//126               array[--firstIndex] = object;
//127           } else if (location == size) {
//128               if (lastIndex == array.length) {
//129                   growAtEnd(1);
//130               }
//131               array[lastIndex++] = object;
//132           } else {
//133               throw new IndexOutOfBoundsException(
//134                       // luni.0A=Index: {0}, Size: {1}
//135                       Messages.getString("luni.0A", //$NON-NLS-1$
//136                               Integer.valueOf(location),
//137                               Integer.valueOf(lastIndex - firstIndex)));
//138           }
//139   
//140           modCount++;
//141       }
//142   
//143       /**
//144        * Adds the specified object at the end of this {@code ArrayList}.
//145        * 
//146        * @param object
//147        *            the object to add.
//148        * @return always true
//149        */
//150       @Override
//151       public boolean add(E object) {
//152           if (lastIndex == array.length) {
//153               growAtEnd(1);
//154           }
//155           array[lastIndex++] = object;
//156           modCount++;
//1           return true;
//158       }
//159   
//160       /**
//161        * Inserts the objects in the specified collection at the specified location
//162        * in this List. The objects are added in the order they are returned from
//163        * the collection's iterator.
//164        * 
//165        * @param location
//166        *            the index at which to insert.
//167        * @param collection
//168        *            the collection of objects.
//169        * @return {@code true} if this {@code ArrayList} is modified, {@code false}
//170        *         otherwise.
//171        * @throws IndexOutOfBoundsException
//172        *             when {@code location < 0 || > size()}
//173        */
//174       @Override
//175       public boolean addAll(int location, Collection<? extends E> collection) {
//176           int size = lastIndex - firstIndex;
//177           if (location < 0 || location > size) {
//178               throw new IndexOutOfBoundsException(
//179                       // luni.0A=Index: {0}, Size: {1}
//180                       Messages.getString("luni.0A", //$NON-NLS-1$
//181                               Integer.valueOf(location),
//182                               Integer.valueOf(lastIndex - firstIndex)));
//183           }
//184           if (this == collection) {
//185               collection = (ArrayList)clone();
//186           }
//187           Object[] dumparray = collection.toArray();
//188           int growSize = dumparray.length;
//189           if (growSize == 0) {
//190               return false;
//191           }
//192   
//193           if (0 < location && location < size) {
//194               if (array.length - size < growSize) {
//195                   growForInsert(location, growSize);
//196               } else if ((location < size / 2 && firstIndex > 0)
//197                       || lastIndex > array.length - growSize) {
//198                   int newFirst = firstIndex - growSize;
//199                   if (newFirst < 0) {
//200                       int index = location + firstIndex;
//201                       System.arraycopy(array, index, array, index - newFirst,
//202                               size - location);
//203                       lastIndex -= newFirst;
//204                       newFirst = 0;
//205                   }
//206                   System.arraycopy(array, firstIndex, array, newFirst, location);
//207                   firstIndex = newFirst;
//208               } else {
//209                   int index = location + firstIndex;
//210                   System.arraycopy(array, index, array, index + growSize, size
//211                           - location);
//212                   lastIndex += growSize;
//213               }
//214           } else if (location == 0) {
//215               growAtFront(growSize);
//216               firstIndex -= growSize;
//217           } else if (location == size) {
//218               if (lastIndex > array.length - growSize) {
//219                   growAtEnd(growSize);
//220               }
//221               lastIndex += growSize;
//222           }
//223   
//224           System.arraycopy(dumparray, 0, this.array, location + firstIndex,
//225                   growSize);
//226           modCount++;
//227           return true;
//228       }
//229   
//230       /**
//231        * Adds the objects in the specified collection to this {@code ArrayList}.
//232        * 
//233        * @param collection
//234        *            the collection of objects.
//235        * @return {@code true} if this {@code ArrayList} is modified, {@code false}
//236        *         otherwise.
//237        */
//238       @Override
//239       public boolean addAll(Collection<? extends E> collection) {
//240           Object[] dumpArray = collection.toArray();
//241           if (dumpArray.length == 0) {
//242               return false;
//243           }
//244           if (dumpArray.length > array.length - lastIndex) {
//245               growAtEnd(dumpArray.length);
//246           }
//247           System.arraycopy(dumpArray, 0, this.array, lastIndex, dumpArray.length);
//248           lastIndex += dumpArray.length;
//249           modCount++;
//250           return true;
//251       }
//252   
//253       /**
//254        * Removes all elements from this {@code ArrayList}, leaving it empty.
//255        * 
//256        * @see #isEmpty
//2        * @see #size
//258        */
//259       @Override
//260       public void clear() {
//261           if (firstIndex != lastIndex) {
//262               Arrays.fill(array, firstIndex, lastIndex, null);
//263               firstIndex = lastIndex = 0;
//264               modCount++;
//265           }
//266       }
//267   
//268       /**
//269        * Returns a new {@code ArrayList} with the same elements, the same size and
//270        * the same capacity as this {@code ArrayList}.
//271        * 
//272        * @return a shallow copy of this {@code ArrayList}
//273        * @see java.lang.Cloneable
//274        */
//275       @Override
//276       @SuppressWarnings("unchecked")
//277       public Object clone() {
//278           try {
//279               ArrayList<E> newList = (ArrayList<E>) super.clone();
//280               newList.array = array.clone();
//281               return newList;
//282           } catch (CloneNotSupportedException e) {
//283               return null;
//284           }
//285       }
//286   
//287       /**
//288        * Searches this {@code ArrayList} for the specified object.
//289        * 
//290        * @param object
//291        *            the object to search for.
//292        * @return {@code true} if {@code object} is an element of this
//293        *         {@code ArrayList}, {@code false} otherwise
//294        */
//295       @Override
//296       public boolean contains(Object object) {
//297           if (object != null) {
//298               for (int i = firstIndex; i < lastIndex; i++) {
//299                   if (object.equals(array[i])) {
//300                       return true;
//301                   }
//302               }
//303           } else {
//304               for (int i = firstIndex; i < lastIndex; i++) {
//305                   if (array[i] == null) {
//306                       return true;
//307                   }
//308               }
//309           }
//310           return false;
//311       }
//312   
//313       /**
//314        * Ensures that after this operation the {@code ArrayList} can hold the
//315        * specified number of elements without further growing.
//316        * 
//317        * @param minimumCapacity
//318        *            the minimum capacity asked for.
//319        */
//320       public void ensureCapacity(int minimumCapacity) {
//321           if (array.length < minimumCapacity) {
//322               if (firstIndex > 0) {
//323                   growAtFront(minimumCapacity - array.length);
//324               } else {
//325                   growAtEnd(minimumCapacity - array.length);
//326               }
//327           }
//328       }
//329   
//330       @Override
//331       public E get(int location) {
//332           if (0 <= location && location < (lastIndex - firstIndex)) {
//333               return array[firstIndex + location];
//334           }
//335           throw new IndexOutOfBoundsException(
//336                   // luni.0A=Index: {0}, Size: {1}
//337                   Messages.getString("luni.0A", //$NON-NLS-1$
//338                           Integer.valueOf(location),
//339                           Integer.valueOf(lastIndex - firstIndex)));
//340       }
//341   
//342       private void growAtEnd(int required) {
//343           int size = lastIndex - firstIndex;
//344           if (firstIndex >= required - (array.length - lastIndex)) {
//345               int newLast = lastIndex - firstIndex;
//346               if (size > 0) {
//347                   System.arraycopy(array, firstIndex, array, 0, size);
//348                   int start = newLast < firstIndex ? firstIndex : newLast;
//349                   Arrays.fill(array, start, array.length, null);
//350               }
//351               firstIndex = 0;
//352               lastIndex = newLast;
//353           } else {
//354               int increment = size / 2;
//355               if (required > increment) {
//356                   increment = required;
//3               }
//358               if (increment < 12) {
//359                   increment = 12;
//360               }
//361               E[] newArray = newElementArray(size + increment);
//362               if (size > 0) {
//363                   System.arraycopy(array, firstIndex, newArray, 0, size);
//364                   firstIndex = 0;
//365                   lastIndex = size;
//366               }
//367               array = newArray;
//368           }
//369       }
//370   
//371       private void growAtFront(int required) {
//372           int size = lastIndex - firstIndex;
//373           if (array.length - lastIndex + firstIndex >= required) {
//374               int newFirst = array.length - size;
//375               if (size > 0) {
//376                   System.arraycopy(array, firstIndex, array, newFirst, size);
//377                   int length = firstIndex + size > newFirst ? newFirst
//378                           : firstIndex + size;
//379                   Arrays.fill(array, firstIndex, length, null);
//380               }
//381               firstIndex = newFirst;
//382               lastIndex = array.length;
//383           } else {
//384               int increment = size / 2;
//385               if (required > increment) {
//386                   increment = required;
//387               }
//388               if (increment < 12) {
//389                   increment = 12;
//390               }
//391               E[] newArray = newElementArray(size + increment);
//392               if (size > 0) {
//393                   System.arraycopy(array, firstIndex, newArray, newArray.length
//394                           - size, size);
//395               }
//396               firstIndex = newArray.length - size;
//397               lastIndex = newArray.length;
//398               array = newArray;
//399           }
//400       }
//401   
//402       private void growForInsert(int location, int required) {
//403           int size = lastIndex - firstIndex;
//404           int increment = size / 2;
//405           if (required > increment) {
//406               increment = required;
//407           }
//408           if (increment < 12) {
//409               increment = 12;
//410           }
//411           E[] newArray = newElementArray(size + increment);
//412           int newFirst = increment - required;
//413           // Copy elements after location to the new array skipping inserted
//414           // elements
//415           System.arraycopy(array, location + firstIndex, newArray, newFirst
//416                   + location + required, size - location);
//417           // Copy elements before location to the new array from firstIndex
//418           System.arraycopy(array, firstIndex, newArray, newFirst, location);
//419           firstIndex = newFirst;
//420           lastIndex = size + increment;
//421   
//422           array = newArray;
//423       }
//424   
//425       @Override
//426       public int indexOf(Object object) {
//427           if (object != null) {
//428               for (int i = firstIndex; i < lastIndex; i++) {
//429                   if (object.equals(array[i])) {
//430                       return i - firstIndex;
//431                   }
//432               }
//433           } else {
//434               for (int i = firstIndex; i < lastIndex; i++) {
//435                   if (array[i] == null) {
//436                       return i - firstIndex;
//437                   }
//438               }
//439           }
//440           return -1;
//441       }
//442   
//443       @Override
//444       public boolean isEmpty() {
//445           return lastIndex == firstIndex;
//446       }
//447   
//448       @Override
//449       public int lastIndexOf(Object object) {
//450           if (object != null) {
//451               for (int i = lastIndex - 1; i >= firstIndex; i--) {
//452                   if (object.equals(array[i])) {
//453                       return i - firstIndex;
//454                   }
//455               }
//456           } else {
//4               for (int i = lastIndex - 1; i >= firstIndex; i--) {
//458                   if (array[i] == null) {
//459                       return i - firstIndex;
//460                   }
//461               }
//462           }
//463           return -1;
//464       }
//465   
//466       /**
//467        * Removes the object at the specified location from this list.
//468        * 
//469        * @param location
//470        *            the index of the object to remove.
//471        * @return the removed object.
//472        * @throws IndexOutOfBoundsException
//473        *             when {@code location < 0 || >= size()}
//474        */
//475       @Override
//476       public E remove(int location) {
//477           E result;
//478           int size = lastIndex - firstIndex;
//479           if (0 <= location && location < size) {
//480               if (location == size - 1) {
//481                   result = array[--lastIndex];
//482                   array[lastIndex] = null;
//483               } else if (location == 0) {
//484                   result = array[firstIndex];
//485                   array[firstIndex++] = null;
//486               } else {
//487                   int elementIndex = firstIndex + location;
//488                   result = array[elementIndex];
//489                   if (location < size / 2) {
//490                       System.arraycopy(array, firstIndex, array, firstIndex + 1,
//491                               location);
//492                       array[firstIndex++] = null;
//493                   } else {
//494                       System.arraycopy(array, elementIndex + 1, array,
//495                               elementIndex, size - location - 1);
//496                       array[--lastIndex] = null;
//497                   }
//498               }
//499               if (firstIndex == lastIndex) {
//500                   firstIndex = lastIndex = 0;
//501               }
//502           } else {
//503               throw new IndexOutOfBoundsException(
//504                       // luni.0A=Index: {0}, Size: {1}
//505                       Messages.getString("luni.0A", //$NON-NLS-1$
//506                               Integer.valueOf(location),
//507                               Integer.valueOf(lastIndex - firstIndex)));
//508           }
//509   
//510           modCount++;
//511           return result;
//512       }
//513   
//514       @Override
//515       public boolean remove(Object object) {
//516           int location = indexOf(object);
//517           if (location >= 0) {
//518               remove(location);
//519               return true;
//520           }
//521           return false;
//522       }
//523   
//524       /**
//525        * Removes the objects in the specified range from the start to the end, but
//526        * not including the end index.
//527        * 
//528        * @param start
//529        *            the index at which to start removing.
//530        * @param end
//531        *            the index one after the end of the range to remove.
//532        * @throws IndexOutOfBoundsException
//533        *             when {@code start < 0, start > end} or {@code end > size()}
//534        */
//535       @Override
//536       protected void removeRange(int start, int end) {
//537           if (start >= 0 && start <= end && end <= (lastIndex - firstIndex)) {
//538               if (start == end) {
//539                   return;
//540               }
//541               int size = lastIndex - firstIndex;
//542               if (end == size) {
//543                   Arrays.fill(array, firstIndex + start, lastIndex, null);
//544                   lastIndex = firstIndex + start;
//545               } else if (start == 0) {
//546                   Arrays.fill(array, firstIndex, firstIndex + end, null);
//547                   firstIndex += end;
//548               } else {
//549                   System.arraycopy(array, firstIndex + end, array, firstIndex
//550                           + start, size - end);
//551                   int newLast = lastIndex + start - end;
//552                   Arrays.fill(array, newLast, lastIndex, null);
//553                   lastIndex = newLast;
//554               }
//555               modCount++;
//556           } else {
//5               throw new IndexOutOfBoundsException(
//558                       // luni.0B=Array index out of range: {0}
//559                       Messages.getString("luni.0B", //$NON-NLS-1$
//560                               lastIndex - firstIndex - end));
//561           }
//562       }
//563   
//564       /**
//565        * Replaces the element at the specified location in this {@code ArrayList}
//566        * with the specified object.
//567        * 
//568        * @param location
//569        *            the index at which to put the specified object.
//0        * @param object
//1        *            the object to add.
//2        * @return the previous element at the index.
//3        * @throws IndexOutOfBoundsException
//4        *             when {@code location < 0 || >= size()}
//5        */
//6       @Override
//7       public E set(int location, E object) {
//8           if (0 <= location && location < (lastIndex - firstIndex)) {
//9               E result = array[firstIndex + location];
//580               array[firstIndex + location] = object;
//581               return result;
//582           }
//583           throw new IndexOutOfBoundsException(
//584                   // luni.0A=Index: {0}, Size: {1}
//585                   Messages.getString("luni.0A", //$NON-NLS-1$
//586                           Integer.valueOf(location),
//587                           Integer.valueOf(lastIndex - firstIndex)));
//588       }
//589   
//590       /**
//591        * Returns the number of elements in this {@code ArrayList}.
//592        * 
//593        * @return the number of elements in this {@code ArrayList}.
//594        */
//595       @Override
//596       public int size() {
//597           return lastIndex - firstIndex;
//598       }
//599   
//600       /**
//601        * Returns a new array containing all elements contained in this
//602        * {@code ArrayList}.
//603        * 
//604        * @return an array of the elements from this {@code ArrayList}
//605        */
//606       @Override
//607       public Object[] toArray() {
//608           int size = lastIndex - firstIndex;
//609           Object[] result = new Object[size];
//610           System.arraycopy(array, firstIndex, result, 0, size);
//611           return result;
//612       }
//613   
//614       /**
//615        * Returns an array containing all elements contained in this
//616        * {@code ArrayList}. If the specified array is large enough to hold the
//617        * elements, the specified array is used, otherwise an array of the same
//618        * type is created. If the specified array is used and is larger than this
//619        * {@code ArrayList}, the array element following the collection elements
//620        * is set to null.
//621        * 
//622        * @param contents
//623        *            the array.
//624        * @return an array of the elements from this {@code ArrayList}.
//625        * @throws ArrayStoreException
//626        *             when the type of an element in this {@code ArrayList} cannot
//627        *             be stored in the type of the specified array.
//628        */
//629       @Override
//630       @SuppressWarnings("unchecked")
//631       public <T> T[] toArray(T[] contents) {
//632           int size = lastIndex - firstIndex;
//633           if (size > contents.length) {
//634               Class<?> ct = contents.getClass().getComponentType();
//635               contents = (T[]) Array.newInstance(ct, size);
//636           }
//637           System.arraycopy(array, firstIndex, contents, 0, size);
//638           if (size < contents.length) {
//639               contents[size] = null;
//640           }
//641           return contents;
//642       }
//643   
//644       /**
//645        * Sets the capacity of this {@code ArrayList} to be the same as the current
//646        * size.
//647        * 
//648        * @see #size
//649        */
//650       public void trimToSize() {
//651           int size = lastIndex - firstIndex;
//652           E[] newArray = newElementArray(size);
//653           System.arraycopy(array, firstIndex, newArray, 0, size);
//654           array = newArray;
//655           firstIndex = 0;
//656           lastIndex = array.length;
//6           modCount = 0;
//658       }
//659   
//660       private static final ObjectStreamField[] serialPersistentFields = { new ObjectStreamField(
//66               "size", Integer.TYPE) }; //$NON-NLS-$
//662   
//663       private void writeObject(ObjectOutputStream stream) throws IOException {
//664           ObjectOutputStream.PutField fields = stream.putFields();
//665           fields.put("size", lastIndex - firstIndex); //$NON-NLS-1$
//666           stream.writeFields();
//667           stream.writeInt(array.length);
//668           Iterator<?> it = iterator();
//669           while (it.hasNext()) {
//670               stream.writeObject(it.next());
//671           }
//672       }
//673   
//674       @SuppressWarnings("unchecked")
//675       private void readObject(ObjectInputStream stream) throws IOException,
//676               ClassNotFoundException {
//677           ObjectInputStream.GetField fields = stream.readFields();
//678           lastIndex = fields.get("size", 0); //$NON-NLS-1$
//679           array = newElementArray(stream.readInt());
//680           for (int i = 0; i < lastIndex; i++) {
//681               array[i] = (E) stream.readObject();
//682           }
//683       }
//684   }
