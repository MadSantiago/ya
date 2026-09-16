package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۦۦٌٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5792 {

    /* JADX INFO: renamed from: ۥۣ */
    public static final C5086 f19084;

    static {
        Object c3174;
        ((C1735) AbstractC4049.f13495).getClass();
        AtomicReference atomicReference = C2116.f6953;
        String strReplace = "Phlogger";
        if (atomicReference.get() != null) {
            C4949 c4949 = (C4949) atomicReference.get();
            c3174 = new C3174(strReplace, c4949.f16375, c4949.f16374, c4949.f16373);
        } else {
            for (int i = 7; i >= 0; i--) {
                char cCharAt = "Phlogger".charAt(i);
                if (cCharAt == '$') {
                    strReplace = "Phlogger".replace('$', '.');
                    break;
                } else {
                    if (cCharAt == '.') {
                        break;
                    }
                }
            }
            C2116 c2116 = new C2116(strReplace);
            if (C2116.f6951 || C2116.f6955) {
                c2116.f6957 = new C3605(strReplace);
            } else if (C2116.f6952) {
                C4949 c49410 = C3174.f10666;
                c2116.f6957 = new C3174(strReplace, Level.OFF, c49410.f16374, c49410.f16373);
            } else {
                c2116.f6957 = null;
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = AbstractC2295.f7623;
            concurrentLinkedQueue.offer(c2116);
            c3174 = c2116;
            if (atomicReference.get() != null) {
                while (true) {
                    C2116 c2117 = (C2116) concurrentLinkedQueue.poll();
                    if (c2117 == null) {
                        break;
                    }
                    C4949 c49411 = (C4949) atomicReference.get();
                    c2117.f6957 = new C3174(c2117.f18563, c49411.f16375, c49411.f16374, c49411.f16373);
                }
                C2116.m4095();
                c3174 = c2116;
            }
        }
        f19084 = new C5086(2, c3174);
    }
}
