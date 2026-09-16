package p000;

import android.os.Looper;
import android.view.Choreographer;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ۥ۟ؔۛۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2452 extends ThreadLocal {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f8166;

    public /* synthetic */ C2452(int i) {
        this.f8166 = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f8166) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    C5418 c5418 = new C5418(choreographer, AbstractC4554.m7893(looperMyLooper));
                    return AbstractC4593.m7963(c5418, c5418.f17887);
                }
                C1078.m2276("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(AbstractC4031.f13448);
                return simpleDateFormat;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new Random();
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                C5245 c5245 = new C5245();
                c5245.f17314 = 0;
                return c5245;
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return 0L;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                AbstractC0949.m1936(Thread.currentThread());
                C1037 c1037 = new C1037();
                c1037.f3671 = false;
                c1037.f3670 = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = AbstractC5474.f18061;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, c1037);
                    break;
                }
                return c1037;
            default:
                return new Random();
        }
    }
}
