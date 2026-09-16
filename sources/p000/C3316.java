package p000;

import android.os.Build;
import android.os.Trace;
import androidx.work.Worker;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ۦؕۚۢ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3316 implements InterfaceC4745 {

    /* JADX INFO: renamed from: ۥَ */
    public final /* synthetic */ Object f11106;

    /* JADX INFO: renamed from: ۥْ */
    public final /* synthetic */ Object f11107;

    /* JADX INFO: renamed from: ۥٓ */
    public final /* synthetic */ Object f11108;

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ boolean f11109;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f11110;

    public /* synthetic */ C3316(boolean z, InterfaceC4448 interfaceC4448, InterfaceC4448 interfaceC4449, InterfaceC4745 interfaceC4745) {
        this.f11110 = 2;
        this.f11109 = z;
        this.f11107 = interfaceC4448;
        this.f11108 = interfaceC4449;
        this.f11106 = interfaceC4745;
    }

    @Override // p000.InterfaceC4745
    /* JADX INFO: renamed from: ۦؚ */
    public final Object mo211(Object obj) {
        int i = this.f11110;
        C2358 c2358 = C2358.f7817;
        boolean z = this.f11109;
        Object obj2 = this.f11106;
        Object obj3 = this.f11108;
        Object obj4 = this.f11107;
        switch (i) {
            case 0:
                C1955 c1955 = (C1955) obj3;
                C1516 c1516 = (C1516) obj2;
                C2497 c2497 = (C2497) obj;
                c2497.m4644();
                C2004 c2004 = c2497.f8304;
                if (((Boolean) ((InterfaceC4448) obj4).mo449()).booleanValue()) {
                    if (z) {
                        long jMo4568 = c2004.mo4568();
                        C2808 c2808 = c2004.f6603;
                        long jM5355 = c2808.m5355();
                        c2808.m5353().mo2092();
                        try {
                            ((C5086) c2808.f9378).m8702(-1.0f, 1.0f, jMo4568);
                            InterfaceC2442.m4558(c2497, c1955, c1516);
                        } finally {
                            c2808.m5353().mo2095();
                            c2808.m5351(jM5355);
                        }
                    } else {
                        InterfaceC2442.m4558(c2497, c1955, c1516);
                    }
                }
                return c2358;
            case 1:
                C1347 c1347 = (C1347) obj3;
                C0379 c0379 = (C0379) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ((InterfaceC4745) obj4).mo211(Boolean.valueOf(!z));
                if (zBooleanValue) {
                    c1347.add(c0379.f1417);
                } else {
                    c1347.remove(c0379.f1417);
                }
                return c2358;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C1705(this.f11109, (InterfaceC4448) obj4, (InterfaceC4448) obj3, (EnumC0845) obj, (InterfaceC4745) obj2);
            default:
                Worker worker = (Worker) obj4;
                String str = (String) obj3;
                C5789 c5789 = (C5789) obj2;
                Throwable th = (Throwable) obj;
                if (th instanceof C5771) {
                    worker.f243.compareAndSet(-256, ((C5771) th).f19022);
                }
                if (z && str != null) {
                    int iHashCode = c5789.f19075.hashCode();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC4346.m7640(iHashCode, AbstractC5568.m9363(str));
                    } else {
                        String strM9363 = AbstractC5568.m9363(str);
                        try {
                            Method method = AbstractC5568.f18390;
                            if (method == null) {
                                method = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                                AbstractC5568.f18390 = method;
                            }
                            method.invoke(null, Long.valueOf(AbstractC5568.f18385), strM9363, Integer.valueOf(iHashCode));
                        } catch (Exception e) {
                            AbstractC5568.m9350("asyncTraceEnd", e);
                        }
                    }
                    break;
                }
                return c2358;
        }
    }

    public /* synthetic */ C3316(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.f11110 = i;
        this.f11107 = obj;
        this.f11109 = z;
        this.f11108 = obj2;
        this.f11106 = obj3;
    }
}
