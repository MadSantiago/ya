package p000;

import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: ۥٜؖۨؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1841 extends AbstractC2797 {

    /* JADX INFO: renamed from: ۥُ */
    public final /* synthetic */ int f6111;

    /* JADX INFO: renamed from: ۥّ */
    public final /* synthetic */ Object f6112;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1841(String str, Object obj, int i) {
        super(str, true);
        this.f6111 = i;
        this.f6112 = obj;
    }

    @Override // p000.AbstractC2797
    /* JADX INFO: renamed from: ۥۣ */
    public final long mo583() {
        int i = 0;
        switch (this.f6111) {
            case 0:
                C0127 c0127 = (C0127) this.f6112;
                c0127.getClass();
                try {
                    c0127.f524.m5832(2, 0, false);
                    break;
                } catch (IOException e) {
                    c0127.m277(2, 2, e);
                }
                return -1L;
            case 1:
                C0615 c0615 = (C0615) this.f6112;
                long jNanoTime = System.nanoTime();
                long j = Long.MIN_VALUE;
                C3641 c3641 = null;
                int i2 = 0;
                for (C3641 c3642 : (ConcurrentLinkedQueue) c0615.f2297) {
                    synchronized (c3642) {
                        if (c0615.m1380(c3642, jNanoTime) > 0) {
                            i2++;
                        } else {
                            i++;
                            long j2 = jNanoTime - c3642.f12180;
                            if (j2 > j) {
                                c3641 = c3642;
                                j = j2;
                            }
                        }
                    }
                }
                long j3 = c0615.f2296;
                if (j < j3 && i <= 5) {
                    if (i > 0) {
                        return j3 - j;
                    }
                    if (i2 > 0) {
                        return j3;
                    }
                    return -1L;
                }
                synchronized (c3641) {
                    if (!c3641.f12191.isEmpty()) {
                        return 0L;
                    }
                    if (c3641.f12180 + j != jNanoTime) {
                        return 0L;
                    }
                    c3641.f12186 = true;
                    ((ConcurrentLinkedQueue) c0615.f2297).remove(c3641);
                    AbstractC4031.m7222(c3641.f12183);
                    if (!((ConcurrentLinkedQueue) c0615.f2297).isEmpty()) {
                        return 0L;
                    }
                    ((C2324) c0615.f2295).m4370();
                    return 0L;
                }
            default:
                ((InterfaceC4448) this.f6112).mo449();
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1841(C0615 c0615, String str) {
        super(str, true);
        this.f6111 = 1;
        this.f6112 = c0615;
    }
}
