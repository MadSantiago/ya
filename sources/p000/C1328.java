package p000;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: renamed from: ۥّٟٔؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1328 {
    private volatile AtomicReferenceArray<Object> array;

    public C1328(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final void m2831(int i, C1041 c1041) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c1041);
            return;
        }
        int i2 = i + 1;
        int i3 = length * 2;
        if (i2 < i3) {
            i2 = i3;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
        for (int i4 = 0; i4 < length; i4++) {
            atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
        }
        atomicReferenceArray2.set(i, c1041);
        this.array = atomicReferenceArray2;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m2832(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m2833() {
        return this.array.length();
    }
}
