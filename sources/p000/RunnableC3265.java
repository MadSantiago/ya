package p000;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ۦؕؒۜۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3265 implements Runnable {

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ C5235 f10961;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AtomicReference f10962;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f10963;

    public RunnableC3265(C5235 c5235, AtomicReference atomicReference, int i) {
        this.f10963 = i;
        switch (i) {
            case 1:
                this.f10962 = atomicReference;
                Objects.requireNonNull(c5235);
                this.f10961 = c5235;
                break;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                this.f10962 = atomicReference;
                Objects.requireNonNull(c5235);
                this.f10961 = c5235;
                break;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                this.f10962 = atomicReference;
                Objects.requireNonNull(c5235);
                this.f10961 = c5235;
                break;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                this.f10962 = atomicReference;
                Objects.requireNonNull(c5235);
                this.f10961 = c5235;
                break;
            default:
                this.f10962 = atomicReference;
                Objects.requireNonNull(c5235);
                this.f10961 = c5235;
                break;
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    private final void m6028() {
        AtomicReference atomicReference = this.f10962;
        synchronized (atomicReference) {
            try {
                try {
                    C5371 c5371 = (C5371) this.f10961.f18660;
                    atomicReference.set(Double.valueOf(c5371.f17715.m1152(c5371.m9029().m3854(), AbstractC4936.f16310)));
                    this.f10962.notify();
                } catch (Throwable th) {
                    this.f10962.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10963) {
            case 0:
                AtomicReference atomicReference = this.f10962;
                synchronized (atomicReference) {
                    try {
                        try {
                            C5371 c5371 = (C5371) this.f10961.f18660;
                            atomicReference.set(Boolean.valueOf(c5371.f17715.m1162(c5371.m9029().m3854(), AbstractC4936.f16304)));
                            this.f10962.notify();
                        } catch (Throwable th) {
                            this.f10962.notify();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f10962;
                synchronized (atomicReference2) {
                    try {
                        try {
                            C5371 c5372 = (C5371) this.f10961.f18660;
                            atomicReference2.set(c5372.f17715.m1164(c5372.m9029().m3854(), AbstractC4936.f16346));
                            this.f10962.notify();
                        } catch (Throwable th3) {
                            this.f10962.notify();
                            throw th3;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                AtomicReference atomicReference3 = this.f10962;
                synchronized (atomicReference3) {
                    try {
                        try {
                            C5371 c5373 = (C5371) this.f10961.f18660;
                            atomicReference3.set(Long.valueOf(c5373.f17715.m1159(c5373.m9029().m3854(), AbstractC4936.f16272)));
                            this.f10962.notify();
                        } catch (Throwable th5) {
                            this.f10962.notify();
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
                return;
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                AtomicReference atomicReference4 = this.f10962;
                synchronized (atomicReference4) {
                    try {
                        try {
                            C5371 c5374 = (C5371) this.f10961.f18660;
                            atomicReference4.set(Integer.valueOf(c5374.f17715.m1153(c5374.m9029().m3854(), AbstractC4936.f16290)));
                            this.f10962.notify();
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    } catch (Throwable th8) {
                        this.f10962.notify();
                        throw th8;
                    }
                }
                return;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                m6028();
                return;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                C5235 c5235 = this.f10961;
                C4474 c4474 = ((C5371) c5235.f18660).f17713;
                C5371.m9021(c4474);
                Bundle bundleM3130 = c4474.f14764.m3130();
                C5695 c5695M9028 = ((C5371) c5235.f18660).m9028();
                AtomicReference atomicReference5 = this.f10962;
                c5695M9028.mo6517();
                c5695M9028.m7643();
                c5695M9028.m9509(new RunnableC1948(c5695M9028, atomicReference5, c5695M9028.m9517(false), bundleM3130, 10, false));
                return;
            default:
                C5695 c5695M9029 = ((C5371) this.f10961.f18660).m9028();
                C3954 c3954M7110 = C3954.m7110(EnumC1962.f6466);
                AtomicReference atomicReference6 = this.f10962;
                c5695M9029.mo6517();
                c5695M9029.m7643();
                c5695M9029.m9509(new RunnableC1948(c5695M9029, atomicReference6, c5695M9029.m9517(false), c3954M7110, 11, false));
                return;
        }
    }

    public /* synthetic */ RunnableC3265(C5235 c5235, AtomicReference atomicReference, int i, boolean z) {
        this.f10963 = i;
        this.f10961 = c5235;
        this.f10962 = atomicReference;
    }
}
