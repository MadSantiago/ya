package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦًٌؑۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3701 {

    /* JADX INFO: renamed from: ۥؗ */
    public static final AtomicReference[] f12338;

    /* JADX INFO: renamed from: ۥۗ */
    public static final int f12339;

    /* JADX INFO: renamed from: ۥۣ */
    public static final C3341 f12340 = new C3341(new byte[0], 0, 0, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f12339 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f12338 = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3341 m6564() {
        AtomicReference atomicReference = f12338[(int) (Thread.currentThread().getId() & (((long) f12339) - 1))];
        C3341 c3341 = f12340;
        C3341 c3342 = (C3341) atomicReference.getAndSet(c3341);
        if (c3342 == c3341) {
            return new C3341();
        }
        if (c3342 == null) {
            atomicReference.set(null);
            return new C3341();
        }
        atomicReference.set(c3342.f11176);
        c3342.f11176 = null;
        c3342.f11174 = 0;
        return c3342;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static final void m6565(C3341 c3341) {
        if (c3341.f11176 != null || c3341.f11180 != null) {
            C1078.m2272("Failed requirement.");
            return;
        }
        if (c3341.f11179) {
            return;
        }
        AtomicReference atomicReference = f12338[(int) (Thread.currentThread().getId() & (((long) f12339) - 1))];
        C3341 c3342 = f12340;
        C3341 c3343 = (C3341) atomicReference.getAndSet(c3342);
        if (c3343 == c3342) {
            return;
        }
        int i = c3343 != null ? c3343.f11174 : 0;
        if (i >= 65536) {
            atomicReference.set(c3343);
            return;
        }
        c3341.f11176 = c3343;
        c3341.f11177 = 0;
        c3341.f11174 = i + 8192;
        atomicReference.set(c3341);
    }
}
