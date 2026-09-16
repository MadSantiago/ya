package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: ۥؓؑؒۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0295 extends AbstractC0073 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final C0295 f1084 = new C0295(new Object[0]);

    /* JADX INFO: renamed from: ۦۨ */
    public final Object[] f1085;

    public C0295(Object[] objArr) {
        this.f1085 = objArr;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr = this.f1085;
        AbstractC0487.m1076(i, objArr.length);
        return objArr[i];
    }

    @Override // p000.AbstractC0015, java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0246.m518(this.f1085, obj);
    }

    @Override // p000.AbstractC0015, java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.f1085;
        if (obj == null) {
            int length = objArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (objArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = objArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (obj.equals(objArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    @Override // p000.AbstractC0015, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.f1085;
        AbstractC0487.m1043(i, objArr.length);
        return new C0427(objArr, i, objArr.length);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۥُ */
    public final AbstractC0073 mo622(Object obj) {
        Object[] objArr = this.f1085;
        if (objArr.length < 32) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
            objArrCopyOf[objArr.length] = obj;
            return new C0295(objArrCopyOf);
        }
        Object[] objArr2 = new Object[32];
        objArr2[0] = obj;
        return new C3454(objArr, objArr2, objArr.length + 1, 0);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC0073 mo623(Collection collection) {
        Object[] objArr = this.f1085;
        if (collection.size() + objArr.length > 32) {
            C4250 c4250Mo629 = mo629();
            c4250Mo629.addAll(collection);
            return c4250Mo629.m7514();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new C0295(objArrCopyOf);
    }

    @Override // p000.AbstractC0096
    /* JADX INFO: renamed from: ۥۗ */
    public final int mo624() {
        return this.f1085.length;
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۥۜ */
    public final AbstractC0073 mo625(C0025 c0025) {
        Object[] objArr = this.f1085;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) c0025.mo211(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        if (length == objArr.length) {
            return this;
        }
        return length == 0 ? f1084 : new C0295(AbstractC0246.m514(objArrCopyOf, 0, length));
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC0073 mo626(int i, Object obj) {
        Object[] objArr = this.f1085;
        AbstractC0487.m1043(i, objArr.length);
        if (i == objArr.length) {
            return mo622(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            AbstractC0246.m519(0, i, 6, objArr, objArr2);
            AbstractC0246.m510(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new C0295(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        AbstractC0246.m510(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new C3454(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦِ */
    public final AbstractC0073 mo627(int i, Object obj) {
        Object[] objArr = this.f1085;
        AbstractC0487.m1076(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        objArrCopyOf[i] = obj;
        return new C0295(objArrCopyOf);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦٛ */
    public final AbstractC0073 mo628(int i) {
        Object[] objArr = this.f1085;
        AbstractC0487.m1076(i, objArr.length);
        if (objArr.length == 1) {
            return f1084;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        AbstractC0246.m510(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new C0295(objArrCopyOf);
    }

    @Override // p000.AbstractC0073
    /* JADX INFO: renamed from: ۦۙ */
    public final C4250 mo629() {
        return new C4250(this, null, this.f1085, 0);
    }
}
