package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ۦؒؒۥۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3094 {

    /* JADX INFO: renamed from: ۥؗ */
    public boolean f10375;

    /* JADX INFO: renamed from: ۥۗ */
    public int f10376;

    /* JADX INFO: renamed from: ۥۣ */
    public Object[] f10377;

    public C3094(int i) {
        AbstractC3933.m7099(i, "initialCapacity");
        this.f10377 = new Object[i];
        this.f10376 = 0;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public static int m5680(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public C2912 m5681() {
        C2912 c2912;
        Object[] objArrCopyOf = this.f10377;
        int i = this.f10376;
        C1160 c1160 = C1160.f4027;
        if (i == 0) {
            c2912 = AbstractC1425.m3025(c1160);
        } else {
            AbstractC3831.m6883(i, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i, c1160);
            int i2 = 1;
            for (int i3 = 1; i3 < i; i3++) {
                Object obj = objArrCopyOf[i3];
                if (c1160.compare(obj, objArrCopyOf[i2 - 1]) != 0) {
                    objArrCopyOf[i2] = obj;
                    i2++;
                }
            }
            Arrays.fill(objArrCopyOf, i2, i, (Object) null);
            if (i2 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i2);
            }
            c2912 = new C2912(AbstractC4822.m8197(i2, objArrCopyOf), c1160);
        }
        this.f10376 = c2912.f9706.size();
        this.f10375 = true;
        return c2912;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public C4645 m5682() {
        this.f10375 = true;
        return AbstractC4822.m8197(this.f10376, this.f10377);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m5683(Object obj) {
        obj.getClass();
        int i = this.f10376 + 1;
        Object[] objArr = this.f10377;
        if (objArr.length < i) {
            this.f10377 = Arrays.copyOf(objArr, m5680(objArr.length, i));
            this.f10375 = false;
        } else if (this.f10375) {
            this.f10377 = (Object[]) objArr.clone();
            this.f10375 = false;
        }
        Object[] objArr2 = this.f10377;
        int i2 = this.f10376;
        this.f10376 = i2 + 1;
        objArr2[i2] = obj;
    }
}
