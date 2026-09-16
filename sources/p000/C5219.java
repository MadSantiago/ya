package p000;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦۛؒۘٗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5219 extends AbstractC0014 {

    /* JADX INFO: renamed from: ۥٓ */
    public static final Object[] f17232 = new Object[0];

    /* JADX INFO: renamed from: ۥْ */
    public int f17233;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object[] f17234;

    /* JADX INFO: renamed from: ۦۨ */
    public int f17235;

    public C5219(C5076 c5076) {
        Object[] objArrM7045 = AbstractC3925.m7045(c5076, new Object[0]);
        this.f17234 = objArrM7045;
        this.f17233 = objArrM7045.length;
        if (objArrM7045.length == 0) {
            this.f17234 = f17232;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.f17233;
        if (i < 0 || i > i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return;
        }
        if (i == i2) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m8845();
        m8838(this.f17233 + 1);
        int iM8844 = m8844(this.f17235 + i);
        int i3 = this.f17233;
        int i4 = (i3 + 1) >> 1;
        int i5 = this.f17235;
        if (i < i4) {
            int length = iM8844 == 0 ? this.f17234.length - 1 : iM8844 - 1;
            int length2 = i5 == 0 ? this.f17234.length - 1 : i5 - 1;
            Object[] objArr = this.f17234;
            if (length >= i5) {
                objArr[length2] = objArr[i5];
                AbstractC0246.m510(i5, i5 + 1, length + 1, objArr, objArr);
            } else {
                AbstractC0246.m510(i5 - 1, i5, objArr.length, objArr, objArr);
                Object[] objArr2 = this.f17234;
                objArr2[objArr2.length - 1] = objArr2[0];
                AbstractC0246.m510(0, 1, length + 1, objArr2, objArr2);
            }
            this.f17234[length] = obj;
            this.f17235 = length2;
        } else {
            int iM8845 = m8844(i3 + i5);
            Object[] objArr3 = this.f17234;
            if (iM8844 < iM8845) {
                AbstractC0246.m510(iM8844 + 1, iM8844, iM8845, objArr3, objArr3);
            } else {
                AbstractC0246.m510(1, 0, iM8845, objArr3, objArr3);
                Object[] objArr4 = this.f17234;
                objArr4[0] = objArr4[objArr4.length - 1];
                AbstractC0246.m510(iM8844 + 1, iM8844, objArr4.length - 1, objArr4, objArr4);
            }
            this.f17234[iM8844] = obj;
        }
        this.f17233++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.f17233;
        if (i < 0 || i > i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return false;
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.f17233) {
            return addAll(collection);
        }
        m8845();
        m8838(collection.size() + this.f17233);
        int iM8844 = m8844(this.f17233 + this.f17235);
        int iM8845 = m8844(this.f17235 + i);
        int size = collection.size();
        if (i >= ((this.f17233 + 1) >> 1)) {
            int i3 = iM8845 + size;
            Object[] objArr = this.f17234;
            if (iM8845 < iM8844) {
                int i4 = size + iM8844;
                if (i4 <= objArr.length) {
                    AbstractC0246.m510(i3, iM8845, iM8844, objArr, objArr);
                } else if (i3 >= objArr.length) {
                    AbstractC0246.m510(i3 - objArr.length, iM8845, iM8844, objArr, objArr);
                } else {
                    int length = iM8844 - (i4 - objArr.length);
                    AbstractC0246.m510(0, length, iM8844, objArr, objArr);
                    Object[] objArr2 = this.f17234;
                    AbstractC0246.m510(i3, iM8845, length, objArr2, objArr2);
                }
            } else {
                AbstractC0246.m510(size, 0, iM8844, objArr, objArr);
                Object[] objArr3 = this.f17234;
                if (i3 >= objArr3.length) {
                    AbstractC0246.m510(i3 - objArr3.length, iM8845, objArr3.length, objArr3, objArr3);
                } else {
                    AbstractC0246.m510(0, objArr3.length - size, objArr3.length, objArr3, objArr3);
                    Object[] objArr4 = this.f17234;
                    AbstractC0246.m510(i3, iM8845, objArr4.length - size, objArr4, objArr4);
                }
            }
            m8837(iM8845, collection);
            return true;
        }
        int i5 = this.f17235;
        int length2 = i5 - size;
        Object[] objArr5 = this.f17234;
        if (iM8845 < i5) {
            AbstractC0246.m510(length2, i5, objArr5.length, objArr5, objArr5);
            Object[] objArr6 = this.f17234;
            if (size >= iM8845) {
                AbstractC0246.m510(objArr6.length - size, 0, iM8845, objArr6, objArr6);
            } else {
                AbstractC0246.m510(objArr6.length - size, 0, size, objArr6, objArr6);
                Object[] objArr7 = this.f17234;
                AbstractC0246.m510(0, size, iM8845, objArr7, objArr7);
            }
        } else if (length2 >= 0) {
            AbstractC0246.m510(length2, i5, iM8845, objArr5, objArr5);
        } else {
            length2 += objArr5.length;
            int i6 = iM8845 - i5;
            int length3 = objArr5.length - length2;
            if (length3 >= i6) {
                AbstractC0246.m510(length2, i5, iM8845, objArr5, objArr5);
            } else {
                AbstractC0246.m510(length2, i5, i5 + length3, objArr5, objArr5);
                Object[] objArr8 = this.f17234;
                AbstractC0246.m510(0, this.f17235 + length3, iM8845, objArr8, objArr8);
            }
        }
        this.f17235 = length2;
        m8837(m8840(iM8845 - size), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m8845();
        m8838(this.f17233 + 1);
        int length = this.f17235;
        if (length == 0) {
            length = this.f17234.length;
        }
        int i = length - 1;
        this.f17235 = i;
        this.f17234[i] = obj;
        this.f17233++;
    }

    public final void addLast(Object obj) {
        m8845();
        m8838(mo1859() + 1);
        this.f17234[m8844(mo1859() + this.f17235)] = obj;
        this.f17233 = mo1859() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            m8845();
            m8842(this.f17235, m8844(mo1859() + this.f17235));
        }
        this.f17235 = 0;
        this.f17233 = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final Object first() {
        if (!isEmpty()) {
            return this.f17234[this.f17235];
        }
        C0178.m384("ArrayDeque is empty.");
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iMo1859 = mo1859();
        if (i >= 0 && i < iMo1859) {
            return this.f17234[m8844(this.f17235 + i)];
        }
        C1078.m2279(AbstractC5078.m8679("index: ", i, iMo1859, ", size: "));
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM8844 = m8844(mo1859() + this.f17235);
        int length = this.f17235;
        if (length < iM8844) {
            while (length < iM8844) {
                if (AbstractC3831.m6874(obj, this.f17234[length])) {
                    i = this.f17235;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (isEmpty() || (length = this.f17235) < iM8844) {
            return -1;
        }
        int length2 = this.f17234.length;
        while (length < length2) {
            if (AbstractC3831.m6874(obj, this.f17234[length])) {
                i = this.f17235;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM8844; i2++) {
            if (AbstractC3831.m6874(obj, this.f17234[i2])) {
                length = i2 + this.f17234.length;
                i = this.f17235;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo1859() == 0;
    }

    public final Object last() {
        if (isEmpty()) {
            C0178.m384("ArrayDeque is empty.");
            return null;
        }
        return this.f17234[m8844(AbstractC2164.m4181(this) + this.f17235)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr;
        int length;
        int i;
        int iM8844 = m8844(mo1859() + this.f17235);
        int i2 = this.f17235;
        if (i2 < iM8844) {
            length = iM8844 - 1;
            if (i2 <= length) {
                while (!AbstractC3831.m6874(obj, this.f17234[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f17235;
                return length - i;
            }
            return -1;
        }
        if (!isEmpty() && this.f17235 >= iM8844) {
            do {
                iM8844--;
                objArr = this.f17234;
                if (-1 >= iM8844) {
                    length = objArr.length - 1;
                    int i3 = this.f17235;
                    if (i3 <= length) {
                        while (!AbstractC3831.m6874(obj, this.f17234[length])) {
                            if (length != i3) {
                                length--;
                            }
                        }
                        i = this.f17235;
                    }
                }
                return length - i;
            } while (!AbstractC3831.m6874(obj, objArr[iM8844]));
            length = iM8844 + this.f17234.length;
            i = this.f17235;
            return length - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo1860(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM8844;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f17234.length != 0) {
            int iM8845 = m8844(mo1859() + this.f17235);
            int i = this.f17235;
            if (i < iM8845) {
                iM8844 = i;
                while (true) {
                    objArr = this.f17234;
                    if (i >= iM8845) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f17234[iM8844] = obj;
                        iM8844++;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM8844, iM8845, (Object) null);
            } else {
                int length = this.f17234.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f17234;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f17234[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM8844 = m8844(i2);
                for (int i3 = 0; i3 < iM8845; i3++) {
                    Object[] objArr3 = this.f17234;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f17234[iM8844] = obj3;
                        iM8844 = m8839(iM8844);
                    }
                }
                z = z2;
            }
            if (z) {
                m8845();
                this.f17233 = m8840(iM8844 - this.f17235);
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            C0178.m384("ArrayDeque is empty.");
            return null;
        }
        m8845();
        Object[] objArr = this.f17234;
        int i = this.f17235;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f17235 = m8839(i);
        this.f17233 = mo1859() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            C0178.m384("ArrayDeque is empty.");
            return null;
        }
        m8845();
        int iM8844 = m8844(AbstractC2164.m4181(this) + this.f17235);
        Object[] objArr = this.f17234;
        Object obj = objArr[iM8844];
        objArr[iM8844] = null;
        this.f17233 = mo1859() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        AbstractC3933.m7102(i, i2, this.f17233);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.f17233) {
            clear();
            return;
        }
        if (i3 == 1) {
            mo1860(i);
            return;
        }
        m8845();
        int i4 = this.f17233 - i2;
        int i5 = this.f17235;
        if (i < i4) {
            int iM8844 = m8844((i - 1) + i5);
            int iM8845 = m8844(this.f17235 + (i2 - 1));
            while (i > 0) {
                int i6 = iM8844 + 1;
                int iMin = Math.min(i, Math.min(i6, iM8845 + 1));
                Object[] objArr = this.f17234;
                int i7 = iM8845 - iMin;
                int i8 = iM8844 - iMin;
                AbstractC0246.m510(i7 + 1, i8 + 1, i6, objArr, objArr);
                iM8844 = m8840(i8);
                iM8845 = m8840(i7);
                i -= iMin;
            }
            int iM8846 = m8844(this.f17235 + i3);
            m8842(this.f17235, iM8846);
            this.f17235 = iM8846;
        } else {
            int iM8847 = m8844(i5 + i2);
            int iM8848 = m8844(this.f17235 + i);
            int i9 = this.f17233;
            while (true) {
                i9 -= i2;
                if (i9 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f17234;
                i2 = Math.min(i9, Math.min(objArr2.length - iM8847, objArr2.length - iM8848));
                Object[] objArr3 = this.f17234;
                int i10 = iM8847 + i2;
                AbstractC0246.m510(iM8848, iM8847, i10, objArr3, objArr3);
                iM8847 = m8844(i10);
                iM8848 = m8844(iM8848 + i2);
            }
            int iM8849 = m8844(this.f17233 + this.f17235);
            m8842(m8840(iM8849 - i3), iM8849);
        }
        this.f17233 -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM8844;
        Object[] objArr;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f17234.length != 0) {
            int iM8845 = m8844(mo1859() + this.f17235);
            int i = this.f17235;
            if (i < iM8845) {
                iM8844 = i;
                while (true) {
                    objArr = this.f17234;
                    if (i >= iM8845) {
                        break;
                    }
                    Object obj = objArr[i];
                    if (collection.contains(obj)) {
                        this.f17234[iM8844] = obj;
                        iM8844++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(objArr, iM8844, iM8845, (Object) null);
            } else {
                int length = this.f17234.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr2 = this.f17234;
                    Object obj2 = objArr2[i];
                    objArr2[i] = null;
                    if (collection.contains(obj2)) {
                        this.f17234[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM8844 = m8844(i2);
                for (int i3 = 0; i3 < iM8845; i3++) {
                    Object[] objArr3 = this.f17234;
                    Object obj3 = objArr3[i3];
                    objArr3[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f17234[iM8844] = obj3;
                        iM8844 = m8839(iM8844);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                m8845();
                this.f17233 = m8840(iM8844 - this.f17235);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int iMo1859 = mo1859();
        if (i < 0 || i >= iMo1859) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, iMo1859, ", size: "));
            return null;
        }
        int iM8844 = m8844(this.f17235 + i);
        Object[] objArr = this.f17234;
        Object obj2 = objArr[iM8844];
        objArr[iM8844] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f17233;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iM8844 = m8844(this.f17233 + this.f17235);
        int i2 = this.f17235;
        if (i2 < iM8844) {
            AbstractC0246.m519(i2, iM8844, 2, this.f17234, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f17234;
            AbstractC0246.m510(0, this.f17235, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f17234;
            AbstractC0246.m510(objArr3.length - this.f17235, 0, iM8844, objArr3, objArr);
        }
        int i3 = this.f17233;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final void m8837(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f17234.length;
        while (i < length && it.hasNext()) {
            this.f17234[i] = it.next();
            i++;
        }
        int i2 = this.f17235;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f17234[i3] = it.next();
        }
        this.f17233 = collection.size() + this.f17233;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m8838(int i) {
        if (i < 0) {
            C1078.m2276("Deque is too big.");
            return;
        }
        Object[] objArr = this.f17234;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f17232) {
            if (i < 10) {
                i = 10;
            }
            this.f17234 = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        AbstractC0246.m510(0, this.f17235, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f17234;
        int length2 = objArr3.length;
        int i3 = this.f17235;
        AbstractC0246.m510(length2 - i3, 0, i3, objArr3, objArr2);
        this.f17235 = 0;
        this.f17234 = objArr2;
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1859() {
        return this.f17233;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final int m8839(int i) {
        if (i == this.f17234.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo1860(int i) {
        int i2 = this.f17233;
        if (i < 0 || i >= i2) {
            C1078.m2279(AbstractC5078.m8679("index: ", i, i2, ", size: "));
            return null;
        }
        if (i == AbstractC2164.m4181(this)) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        m8845();
        int iM8844 = m8844(this.f17235 + i);
        Object[] objArr = this.f17234;
        Object obj = objArr[iM8844];
        int i3 = this.f17233 >> 1;
        int i4 = this.f17235;
        if (i < i3) {
            if (iM8844 >= i4) {
                AbstractC0246.m510(i4 + 1, i4, iM8844, objArr, objArr);
            } else {
                AbstractC0246.m510(1, 0, iM8844, objArr, objArr);
                Object[] objArr2 = this.f17234;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f17235;
                AbstractC0246.m510(i5 + 1, i5, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f17234;
            int i6 = this.f17235;
            objArr3[i6] = null;
            this.f17235 = m8839(i6);
        } else {
            int iM8845 = m8844(AbstractC2164.m4181(this) + i4);
            Object[] objArr4 = this.f17234;
            if (iM8844 <= iM8845) {
                AbstractC0246.m510(iM8844, iM8844 + 1, iM8845 + 1, objArr4, objArr4);
            } else {
                AbstractC0246.m510(iM8844, iM8844 + 1, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f17234;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0246.m510(0, 1, iM8845 + 1, objArr5, objArr5);
            }
            this.f17234[iM8845] = null;
        }
        this.f17233--;
        return obj;
    }

    /* JADX INFO: renamed from: ۦِ */
    public final int m8840(int i) {
        return i < 0 ? i + this.f17234.length : i;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final Object m8841() {
        if (isEmpty()) {
            return null;
        }
        return this.f17234[m8844(AbstractC2164.m4181(this) + this.f17235)];
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final void m8842(int i, int i2) {
        Object[] objArr = this.f17234;
        if (i < i2) {
            Arrays.fill(objArr, i, i2, (Object) null);
        } else {
            Arrays.fill(objArr, i, objArr.length, (Object) null);
            Arrays.fill(this.f17234, 0, i2, (Object) null);
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final Object m8843() {
        if (isEmpty()) {
            return null;
        }
        return this.f17234[this.f17235];
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final int m8844(int i) {
        Object[] objArr = this.f17234;
        return i >= objArr.length ? i - objArr.length : i;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final void m8845() {
        ((AbstractList) this).modCount++;
    }

    public C5219() {
        this.f17234 = f17232;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo1859()]);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        m8845();
        m8838(collection.size() + mo1859());
        m8837(m8844(mo1859() + this.f17235), collection);
        return true;
    }
}
