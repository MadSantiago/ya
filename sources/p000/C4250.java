package p000;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۦّٕؖۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4250 extends AbstractC0014 implements Collection, InterfaceC3984 {

    /* JADX INFO: renamed from: ۥَ */
    public C3223 f14084 = new C3223(18);

    /* JADX INFO: renamed from: ۥْ */
    public Object[] f14085;

    /* JADX INFO: renamed from: ۥٓ */
    public int f14086;

    /* JADX INFO: renamed from: ۥٖ */
    public Object[] f14087;

    /* JADX INFO: renamed from: ۦٗ */
    public Object[] f14088;

    /* JADX INFO: renamed from: ۦۛ */
    public int f14089;

    /* JADX INFO: renamed from: ۦ۟ */
    public Object[] f14090;

    /* JADX INFO: renamed from: ۦۨ */
    public AbstractC0073 f14091;

    public C4250(AbstractC0073 abstractC0073, Object[] objArr, Object[] objArr2, int i) {
        this.f14091 = abstractC0073;
        this.f14090 = objArr;
        this.f14085 = objArr2;
        this.f14086 = i;
        this.f14087 = objArr;
        this.f14088 = objArr2;
        this.f14089 = abstractC0073.mo624();
    }

    /* JADX INFO: renamed from: ۥّ */
    public static void m7509(Object[] objArr, int i, Iterator it) {
        while (i < 32 && it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        AbstractC0487.m1043(i, mo1859());
        if (i == mo1859()) {
            add(obj);
            return;
        }
        ((AbstractList) this).modCount++;
        int iM7517 = m7517();
        if (i >= iM7517) {
            m7526(i - iM7517, obj, this.f14087);
        } else {
            C0334 c0334 = new C0334(null);
            m7526(0, c0334.f1250, m7530(this.f14087, this.f14086, i, obj, c0334));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        Collection collection2;
        Object[] objArrM7515;
        AbstractC0487.m1043(i, this.f14089);
        if (i == this.f14089) {
            return addAll(collection);
        }
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i2 = (i >> 5) << 5;
        int size = ((collection.size() + (this.f14089 - i2)) - 1) / 32;
        if (size == 0) {
            int i3 = i & 31;
            int size2 = ((collection.size() + i) - 1) & 31;
            Object[] objArr = this.f14088;
            Object[] objArrM7536 = m7536(objArr);
            System.arraycopy(objArr, i3, objArrM7536, size2 + 1, m7524() - i3);
            m7509(objArrM7536, i3, collection.iterator());
            this.f14088 = objArrM7536;
            this.f14089 = collection.size() + this.f14089;
            return true;
        }
        Object[][] objArr2 = new Object[size][];
        int iM7524 = m7524();
        int size3 = collection.size() + this.f14089;
        if (size3 > 32) {
            size3 -= (size3 - 1) & (-32);
        }
        if (i >= m7517()) {
            objArrM7515 = m7515();
            collection2 = collection;
            m7525(collection2, i, this.f14088, iM7524, objArr2, size, objArrM7515);
            objArr2 = objArr2;
        } else {
            collection2 = collection;
            Object[] objArr3 = this.f14088;
            if (size3 > iM7524) {
                int i4 = size3 - iM7524;
                Object[] objArrM7535 = m7535(i4, objArr3);
                m7522(collection2, i, i4, objArr2, size, objArrM7535);
                objArr2 = objArr2;
                objArrM7515 = objArrM7535;
            } else {
                objArrM7515 = m7515();
                int i5 = iM7524 - size3;
                System.arraycopy(objArr3, i5, objArrM7515, 0, iM7524 - i5);
                int i6 = 32 - i5;
                Object[] objArrM7537 = m7535(i6, this.f14088);
                int i7 = size - 1;
                objArr2[i7] = objArrM7537;
                m7522(collection2, i, i6, objArr2, i7, objArrM7537);
                collection2 = collection2;
            }
        }
        this.f14087 = m7520(this.f14087, i2, objArr2);
        this.f14088 = objArrM7515;
        this.f14089 = collection2.size() + this.f14089;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object[] objArr;
        AbstractC0487.m1076(i, mo1859());
        if (m7517() <= i) {
            objArr = this.f14088;
        } else {
            Object[] objArr2 = this.f14087;
            for (int i2 = this.f14086; i2 > 0; i2 -= 5) {
                objArr2 = objArr2[AbstractC2765.m5139(i, i2)];
            }
            objArr = objArr2;
        }
        return objArr[i & 31];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        AbstractC0487.m1043(i, this.f14089);
        return new C5159(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        return m7523(new C0025(1, collection));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        AbstractC0487.m1076(i, mo1859());
        if (m7517() > i) {
            C0334 c0334 = new C0334(null);
            this.f14087 = m7521(this.f14087, this.f14086, i, obj, c0334);
            return c0334.f1250;
        }
        Object[] objArrM7536 = m7536(this.f14088);
        if (objArrM7536 != this.f14088) {
            ((AbstractList) this).modCount++;
        }
        int i2 = i & 31;
        Object obj2 = objArrM7536[i2];
        objArrM7536[i2] = obj;
        this.f14088 = objArrM7536;
        return obj2;
    }

    /* JADX INFO: renamed from: ۥؓ */
    public final int m7510(InterfaceC4745 interfaceC4745, Object[] objArr, int i, C0334 c0334) {
        Object[] objArrM7536 = objArr;
        int i2 = i;
        boolean z = false;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (((Boolean) interfaceC4745.mo211(obj)).booleanValue()) {
                if (!z) {
                    objArrM7536 = m7536(objArr);
                    z = true;
                    i2 = i3;
                }
            } else if (z) {
                objArrM7536[i2] = obj;
                i2++;
            }
        }
        c0334.f1250 = objArrM7536;
        return i2;
    }

    /* JADX INFO: renamed from: ۥؖ */
    public final int m7511(InterfaceC4745 interfaceC4745, Object[] objArr, int i, int i2, C0334 c0334, ArrayList arrayList, ArrayList arrayList2) {
        if (m7531(objArr)) {
            arrayList.add(objArr);
        }
        Object[] objArr2 = (Object[]) c0334.f1250;
        Object[] objArrM7515 = objArr2;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (!((Boolean) interfaceC4745.mo211(obj)).booleanValue()) {
                if (i2 == 32) {
                    objArrM7515 = !arrayList.isEmpty() ? (Object[]) arrayList.remove(arrayList.size() - 1) : m7515();
                    i2 = 0;
                }
                objArrM7515[i2] = obj;
                i2++;
            }
        }
        c0334.f1250 = objArrM7515;
        if (objArr2 != objArrM7515) {
            arrayList2.add(objArr2);
        }
        return i2;
    }

    /* JADX INFO: renamed from: ۥً */
    public final Object[] m7512(Object[] objArr, int i, int i2, C0334 c0334) {
        int iM5139 = AbstractC2765.m5139(i2, i);
        if (i == 0) {
            Object obj = objArr[iM5139];
            Object[] objArrM7536 = m7536(objArr);
            int i3 = iM5139 + 1;
            System.arraycopy(objArr, i3, objArrM7536, iM5139, 32 - i3);
            objArrM7536[31] = c0334.f1250;
            c0334.f1250 = obj;
            return objArrM7536;
        }
        int iM51310 = objArr[31] == null ? AbstractC2765.m5139(m7517() - 1, i) : 31;
        Object[] objArrM7537 = m7536(objArr);
        int i4 = i - 5;
        int i5 = iM5139 + 1;
        if (i5 <= iM51310) {
            while (true) {
                objArrM7537[iM51310] = m7512((Object[]) objArrM7537[iM51310], i4, 0, c0334);
                if (iM51310 == i5) {
                    break;
                }
                iM51310--;
            }
        }
        objArrM7537[iM5139] = m7512((Object[]) objArrM7537[iM5139], i4, i2, c0334);
        return objArrM7537;
    }

    /* JADX INFO: renamed from: ۥَ */
    public final Object[] m7513(Object[] objArr, int i, int i2) {
        if (!(i2 >= 0)) {
            AbstractC0371.m795("shift should be positive");
        }
        if (i2 == 0) {
            return objArr;
        }
        int iM5139 = AbstractC2765.m5139(i, i2);
        Object objM7513 = m7513((Object[]) objArr[iM5139], i, i2 - 5);
        if (iM5139 < 31) {
            int i3 = iM5139 + 1;
            if (objArr[i3] != null) {
                if (m7531(objArr)) {
                    Arrays.fill(objArr, i3, 32, (Object) null);
                }
                Object[] objArrM7515 = m7515();
                System.arraycopy(objArr, 0, objArrM7515, 0, i3);
                objArr = objArrM7515;
            }
        }
        if (objM7513 == objArr[iM5139]) {
            return objArr;
        }
        Object[] objArrM7536 = m7536(objArr);
        objArrM7536[iM5139] = objM7513;
        return objArrM7536;
    }

    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0073 m7514() {
        AbstractC0073 c3454;
        Object[] objArr = this.f14087;
        if (objArr == this.f14090 && this.f14088 == this.f14085) {
            c3454 = this.f14091;
        } else {
            this.f14084 = new C3223(18);
            this.f14090 = objArr;
            Object[] objArr2 = this.f14088;
            this.f14085 = objArr2;
            if (objArr == null) {
                c3454 = objArr2.length == 0 ? C0295.f1084 : new C0295(Arrays.copyOf(objArr2, this.f14089));
            } else {
                c3454 = new C3454(objArr, objArr2, this.f14089, this.f14086);
            }
        }
        this.f14091 = c3454;
        return c3454;
    }

    /* JADX INFO: renamed from: ۥْ */
    public final Object[] m7515() {
        Object[] objArr = new Object[33];
        objArr[32] = this.f14084;
        return objArr;
    }

    /* JADX INFO: renamed from: ۥٓ */
    public final Object[] m7516(Object obj) {
        Object[] objArr = new Object[33];
        objArr[0] = obj;
        objArr[32] = this.f14084;
        return objArr;
    }

    /* JADX INFO: renamed from: ۥٕ */
    public final int m7517() {
        int i = this.f14089;
        if (i <= 32) {
            return 0;
        }
        return (i - 1) & (-32);
    }

    /* JADX INFO: renamed from: ۥٖ */
    public final Object[] m7518(Object[] objArr, int i, int i2, C0334 c0334) {
        Object[] objArrM7518;
        int iM5139 = AbstractC2765.m5139(i2 - 1, i);
        if (i == 5) {
            c0334.f1250 = objArr[iM5139];
            objArrM7518 = null;
        } else {
            objArrM7518 = m7518((Object[]) objArr[iM5139], i - 5, i2, c0334);
        }
        if (objArrM7518 == null && iM5139 == 0) {
            return null;
        }
        Object[] objArrM7536 = m7536(objArr);
        objArrM7536[iM5139] = objArrM7518;
        return objArrM7536;
    }

    /* JADX INFO: renamed from: ۥٙ */
    public final Object[] m7519(int i, Object[] objArr, Object[] objArr2) {
        int iM5139 = AbstractC2765.m5139(mo1859() - 1, i);
        Object[] objArrM7536 = m7536(objArr);
        if (i == 5) {
            objArrM7536[iM5139] = objArr2;
            return objArrM7536;
        }
        objArrM7536[iM5139] = m7519(i - 5, (Object[]) objArrM7536[iM5139], objArr2);
        return objArrM7536;
    }

    /* JADX INFO: renamed from: ۥۖ */
    public final Object[] m7520(Object[] objArr, int i, Object[][] objArr2) {
        C0084 c0084 = new C0084(1, objArr2);
        int i2 = i >> 5;
        int i3 = this.f14086;
        Object[] objArrM7534 = i2 < (1 << i3) ? m7534(objArr, i, i3, c0084) : m7536(objArr);
        while (c0084.hasNext()) {
            this.f14086 += 5;
            objArrM7534 = m7516(objArrM7534);
            int i4 = this.f14086;
            m7534(objArrM7534, 1 << i4, i4, c0084);
        }
        return objArrM7534;
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo1859() {
        return this.f14089;
    }

    /* JADX INFO: renamed from: ۥۙ */
    public final Object[] m7521(Object[] objArr, int i, int i2, Object obj, C0334 c0334) {
        int iM5139 = AbstractC2765.m5139(i2, i);
        Object[] objArrM7536 = m7536(objArr);
        if (i != 0) {
            objArrM7536[iM5139] = m7521((Object[]) objArrM7536[iM5139], i - 5, i2, obj, c0334);
            return objArrM7536;
        }
        if (objArrM7536 != objArr) {
            ((AbstractList) this).modCount++;
        }
        c0334.f1250 = objArrM7536[iM5139];
        objArrM7536[iM5139] = obj;
        return objArrM7536;
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m7522(Collection collection, int i, int i2, Object[][] objArr, int i3, Object[] objArr2) {
        if (this.f14087 == null) {
            C1078.m2276("root is null");
            return;
        }
        int i4 = i >> 5;
        AbstractC0028 abstractC0028M7533 = m7533(m7517() >> 5);
        int i5 = i3;
        Object[] objArrM7535 = objArr2;
        while (abstractC0028M7533.f5661 - 1 != i4) {
            Object[] objArr3 = (Object[]) abstractC0028M7533.previous();
            AbstractC0246.m510(0, 32 - i2, 32, objArr3, objArrM7535);
            objArrM7535 = m7535(i2, objArr3);
            i5--;
            objArr[i5] = objArrM7535;
        }
        Object[] objArr4 = (Object[]) abstractC0028M7533.previous();
        int iM7517 = i3 - (((m7517() >> 5) - 1) - i4);
        if (iM7517 < i3) {
            objArr2 = objArr[iM7517];
        }
        m7525(collection, i, objArr4, 32, objArr, iM7517, objArr2);
    }

    /* JADX INFO: renamed from: ۥۧ */
    public final boolean m7523(InterfaceC4745 interfaceC4745) {
        int i;
        InterfaceC4745 interfaceC4746 = interfaceC4745;
        int iM7524 = m7524();
        Object[] objArrM7513 = null;
        C0334 c0334 = new C0334(null);
        boolean z = false;
        if (this.f14087 == null) {
            int iM7510 = m7510(interfaceC4746, this.f14088, iM7524, c0334);
            Object obj = c0334.f1250;
            if (iM7510 == iM7524) {
                iM7510 = iM7524;
            } else {
                Object[] objArr = (Object[]) obj;
                Arrays.fill(objArr, iM7510, iM7524, (Object) null);
                this.f14088 = objArr;
                this.f14089 -= iM7524 - iM7510;
            }
            if (iM7510 != iM7524) {
                z = true;
            }
        } else {
            AbstractC0028 abstractC0028M7533 = m7533(0);
            int iM7511 = 32;
            while (iM7511 == 32 && abstractC0028M7533.hasNext()) {
                iM7511 = m7510(interfaceC4746, (Object[]) abstractC0028M7533.next(), 32, c0334);
            }
            if (iM7511 == 32) {
                int iM7512 = m7510(interfaceC4746, this.f14088, iM7524, c0334);
                Object obj2 = c0334.f1250;
                if (iM7512 == iM7524) {
                    iM7512 = iM7524;
                } else {
                    Object[] objArr2 = (Object[]) obj2;
                    Arrays.fill(objArr2, iM7512, iM7524, (Object) null);
                    this.f14088 = objArr2;
                    this.f14089 -= iM7524 - iM7512;
                }
                if (iM7512 == 0) {
                    m7528(this.f14087, this.f14089, this.f14086);
                }
                if (iM7512 != iM7524) {
                }
            } else {
                int i2 = (abstractC0028M7533.f5661 - 1) << 5;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                int iM7513 = iM7511;
                while (abstractC0028M7533.hasNext()) {
                    iM7513 = m7511(interfaceC4746, (Object[]) abstractC0028M7533.next(), 32, iM7513, c0334, arrayList2, arrayList);
                    interfaceC4746 = interfaceC4745;
                }
                int iM7514 = m7511(interfaceC4745, this.f14088, iM7524, iM7513, c0334, arrayList2, arrayList);
                Object[] objArr3 = (Object[]) c0334.f1250;
                Arrays.fill(objArr3, iM7514, 32, (Object) null);
                boolean zIsEmpty = arrayList.isEmpty();
                Object[] objArrM7534 = this.f14087;
                if (!zIsEmpty) {
                    objArrM7534 = m7534(objArrM7534, i2, this.f14086, arrayList.iterator());
                }
                int size = i2 + (arrayList.size() << 5);
                if ((size & 31) != 0) {
                    AbstractC0371.m795("invalid size");
                }
                if (size == 0) {
                    this.f14086 = 0;
                } else {
                    int i3 = size - 1;
                    while (true) {
                        i = this.f14086;
                        if ((i3 >> i) != 0) {
                            break;
                        }
                        this.f14086 = i - 5;
                        objArrM7534 = objArrM7534[0];
                    }
                    objArrM7513 = m7513(objArrM7534, i3, i);
                }
                this.f14087 = objArrM7513;
                this.f14088 = objArr3;
                this.f14089 = size + iM7514;
            }
            z = true;
        }
        if (z) {
            ((AbstractList) this).modCount++;
        }
        return z;
    }

    @Override // p000.AbstractC0014
    /* JADX INFO: renamed from: ۦؑ */
    public final Object mo1860(int i) {
        AbstractC0487.m1076(i, mo1859());
        ((AbstractList) this).modCount++;
        int iM7517 = m7517();
        if (i >= iM7517) {
            return m7529(this.f14087, iM7517, this.f14086, i - iM7517);
        }
        C0334 c0334 = new C0334(this.f14088[0]);
        m7529(m7512(this.f14087, this.f14086, i, c0334), iM7517, this.f14086, 0);
        return c0334.f1250;
    }

    /* JADX INFO: renamed from: ۦؖ */
    public final int m7524() {
        int i = this.f14089;
        return i <= 32 ? i : i - ((i - 1) & (-32));
    }

    /* JADX INFO: renamed from: ۦؙ */
    public final void m7525(Collection collection, int i, Object[] objArr, int i2, Object[][] objArr2, int i3, Object[] objArr3) {
        Object[] objArrM7515;
        if (i3 < 1) {
            AbstractC0371.m795("requires at least one nullBuffer");
        }
        Object[] objArrM7536 = m7536(objArr);
        objArr2[0] = objArrM7536;
        int i4 = i & 31;
        int size = ((collection.size() + i) - 1) & 31;
        int i5 = (i2 - i4) + size;
        if (i5 < 32) {
            AbstractC0246.m510(size + 1, i4, i2, objArrM7536, objArr3);
        } else {
            int i6 = i5 - 31;
            if (i3 == 1) {
                objArrM7515 = objArrM7536;
            } else {
                objArrM7515 = m7515();
                i3--;
                objArr2[i3] = objArrM7515;
            }
            int i7 = i2 - i6;
            AbstractC0246.m510(0, i7, i2, objArrM7536, objArr3);
            AbstractC0246.m510(size + 1, i4, i7, objArrM7536, objArrM7515);
            objArr3 = objArrM7515;
        }
        Iterator it = collection.iterator();
        m7509(objArrM7536, i4, it);
        for (int i8 = 1; i8 < i3; i8++) {
            Object[] objArrM7516 = m7515();
            m7509(objArrM7516, 0, it);
            objArr2[i8] = objArrM7516;
        }
        m7509(objArr3, 0, it);
    }

    /* JADX INFO: renamed from: ۦِ */
    public final void m7526(int i, Object obj, Object[] objArr) {
        int iM7524 = m7524();
        Object[] objArrM7536 = m7536(this.f14088);
        Object[] objArr2 = this.f14088;
        if (iM7524 >= 32) {
            Object obj2 = objArr2[31];
            AbstractC0246.m510(i + 1, i, 31, objArr2, objArrM7536);
            objArrM7536[i] = obj;
            m7527(objArr, objArrM7536, m7516(obj2));
            return;
        }
        AbstractC0246.m510(i + 1, i, iM7524, objArr2, objArrM7536);
        objArrM7536[i] = obj;
        this.f14087 = objArr;
        this.f14088 = objArrM7536;
        this.f14089++;
    }

    /* JADX INFO: renamed from: ۦٕ */
    public final void m7527(Object[] objArr, Object[] objArr2, Object[] objArr3) {
        int i = this.f14089;
        int i2 = i >> 5;
        int i3 = this.f14086;
        if (i2 > (1 << i3)) {
            this.f14087 = m7519(this.f14086 + 5, m7516(objArr), objArr2);
            this.f14088 = objArr3;
            this.f14086 += 5;
            this.f14089++;
            return;
        }
        if (objArr == null) {
            this.f14087 = objArr2;
            this.f14088 = objArr3;
            this.f14089 = i + 1;
        } else {
            this.f14087 = m7519(i3, objArr, objArr2);
            this.f14088 = objArr3;
            this.f14089++;
        }
    }

    /* JADX INFO: renamed from: ۦٗ */
    public final void m7528(Object[] objArr, int i, int i2) {
        if (i2 == 0) {
            this.f14087 = null;
            if (objArr == null) {
                objArr = new Object[0];
            }
            this.f14088 = objArr;
            this.f14089 = i;
            this.f14086 = i2;
            return;
        }
        C0334 c0334 = new C0334(null);
        Object[] objArrM7518 = m7518(objArr, i2, i, c0334);
        this.f14088 = (Object[]) c0334.f1250;
        this.f14089 = i;
        if (objArrM7518[1] == null) {
            this.f14087 = (Object[]) objArrM7518[0];
            this.f14086 = i2 - 5;
        } else {
            this.f14087 = objArrM7518;
            this.f14086 = i2;
        }
    }

    /* JADX INFO: renamed from: ۦٚ */
    public final Object m7529(Object[] objArr, int i, int i2, int i3) {
        int iMo1859 = mo1859() - i;
        Object[] objArr2 = this.f14088;
        if (iMo1859 == 1) {
            Object obj = objArr2[0];
            m7528(objArr, i, i2);
            return obj;
        }
        Object obj2 = objArr2[i3];
        Object[] objArrM7536 = m7536(objArr2);
        int i4 = i3 + 1;
        System.arraycopy(objArr2, i4, objArrM7536, i3, iMo1859 - i4);
        objArrM7536[iMo1859 - 1] = null;
        this.f14087 = objArr;
        this.f14088 = objArrM7536;
        this.f14089 = (i + iMo1859) - 1;
        this.f14086 = i2;
        return obj2;
    }

    /* JADX INFO: renamed from: ۦٛ */
    public final Object[] m7530(Object[] objArr, int i, int i2, Object obj, C0334 c0334) {
        Object obj2;
        int iM5139 = AbstractC2765.m5139(i2, i);
        if (i == 0) {
            c0334.f1250 = objArr[31];
            Object[] objArrM7536 = m7536(objArr);
            System.arraycopy(objArr, iM5139, objArrM7536, iM5139 + 1, 31 - iM5139);
            objArrM7536[iM5139] = obj;
            return objArrM7536;
        }
        Object[] objArrM7537 = m7536(objArr);
        int i3 = i - 5;
        objArrM7537[iM5139] = m7530((Object[]) objArrM7537[iM5139], i3, i2, obj, c0334);
        while (true) {
            iM5139++;
            if (iM5139 >= 32 || (obj2 = objArrM7537[iM5139]) == null) {
                break;
            }
            objArrM7537[iM5139] = m7530((Object[]) obj2, i3, 0, c0334.f1250, c0334);
        }
        return objArrM7537;
    }

    /* JADX INFO: renamed from: ۦۗ */
    public final boolean m7531(Object[] objArr) {
        return objArr.length == 33 && objArr[32] == this.f14084;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final int m7532() {
        return ((AbstractList) this).modCount;
    }

    /* JADX INFO: renamed from: ۦۚ */
    public final AbstractC0028 m7533(int i) {
        Object[] objArr = this.f14087;
        if (objArr == null) {
            C1078.m2276("Invalid root");
            return null;
        }
        int iM7517 = m7517() >> 5;
        AbstractC0487.m1043(i, iM7517);
        int i2 = this.f14086;
        return i2 == 0 ? new C0427(i, objArr) : new C3110(objArr, i, iM7517, i2 / 5);
    }

    /* JADX INFO: renamed from: ۦۛ */
    public final Object[] m7534(Object[] objArr, int i, int i2, Iterator it) {
        if (!it.hasNext()) {
            AbstractC0371.m795("invalid buffersIterator");
        }
        if (!(i2 >= 0)) {
            AbstractC0371.m795("negative shift");
        }
        if (i2 == 0) {
            return (Object[]) it.next();
        }
        Object[] objArrM7536 = m7536(objArr);
        int iM5139 = AbstractC2765.m5139(i, i2);
        int i3 = i2 - 5;
        objArrM7536[iM5139] = m7534((Object[]) objArrM7536[iM5139], i, i3, it);
        while (true) {
            iM5139++;
            if (iM5139 >= 32 || !it.hasNext()) {
                break;
            }
            objArrM7536[iM5139] = m7534((Object[]) objArrM7536[iM5139], 0, i3, it);
        }
        return objArrM7536;
    }

    /* JADX INFO: renamed from: ۦ۟ */
    public final Object[] m7535(int i, Object[] objArr) {
        if (m7531(objArr)) {
            System.arraycopy(objArr, 0, objArr, i, 32 - i);
            return objArr;
        }
        Object[] objArrM7515 = m7515();
        System.arraycopy(objArr, 0, objArrM7515, i, 32 - i);
        return objArrM7515;
    }

    /* JADX INFO: renamed from: ۦۨ */
    public final Object[] m7536(Object[] objArr) {
        if (objArr == null) {
            return m7515();
        }
        if (m7531(objArr)) {
            return objArr;
        }
        Object[] objArrM7515 = m7515();
        int length = objArr.length;
        if (length > 32) {
            length = 32;
        }
        AbstractC0246.m519(0, length, 6, objArr, objArrM7515);
        return objArrM7515;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        int iM7524 = m7524();
        if (iM7524 < 32) {
            Object[] objArrM7536 = m7536(this.f14088);
            objArrM7536[iM7524] = obj;
            this.f14088 = objArrM7536;
            this.f14089 = mo1859() + 1;
        } else {
            m7527(this.f14087, this.f14088, m7516(obj));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iM7524 = m7524();
        Iterator it = collection.iterator();
        if (32 - iM7524 >= collection.size()) {
            Object[] objArrM7536 = m7536(this.f14088);
            m7509(objArrM7536, iM7524, it);
            this.f14088 = objArrM7536;
            this.f14089 = collection.size() + this.f14089;
            return true;
        }
        int size = ((collection.size() + iM7524) - 1) / 32;
        Object[][] objArr = new Object[size][];
        Object[] objArrM7537 = m7536(this.f14088);
        m7509(objArrM7537, iM7524, it);
        objArr[0] = objArrM7537;
        for (int i = 1; i < size; i++) {
            Object[] objArrM7515 = m7515();
            m7509(objArrM7515, 0, it);
            objArr[i] = objArrM7515;
        }
        this.f14087 = m7520(this.f14087, m7517(), objArr);
        Object[] objArrM7516 = m7515();
        m7509(objArrM7516, 0, it);
        this.f14088 = objArrM7516;
        this.f14089 = collection.size() + this.f14089;
        return true;
    }
}
