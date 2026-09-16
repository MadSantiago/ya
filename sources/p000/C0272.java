package p000;

import android.app.Service;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ۥؒؖۗۦ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0272 implements InterfaceC3077 {

    /* JADX INFO: renamed from: ۦ۟ */
    public Context f972;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f973;

    public C0272(Context context) {
        this.f973 = 6;
        new ConcurrentHashMap();
        AbstractC2552.m4830(context != null, "Context cannot be null", new Object[0]);
        this.f972 = context.getApplicationContext();
    }

    @Override // p000.InterfaceC3077
    public Object get() {
        switch (this.f973) {
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                Object obj = C0996.f3556;
                C2813 c2813 = new C2813(6);
                Context context = this.f972;
                c2813.f9393 = context;
                context.getClass();
                if (((InterfaceC3077) c2813.f9389) == null) {
                    c2813.f9389 = C0996.f3555;
                }
                if (((InterfaceC3077) c2813.f9390) == null) {
                    c2813.f9390 = AbstractC3933.m7074(new C0272((Context) c2813.f9393, 3));
                }
                if (((C2391) c2813.f9388) == null) {
                    c2813.f9388 = new C2391(13, c2813);
                }
                if (((InterfaceC3077) c2813.f9391) == null) {
                    Context context2 = (Context) c2813.f9393;
                    ArrayList arrayList = new ArrayList();
                    C4858 c4858 = new C4858(new C0272(context2));
                    new ConcurrentHashMap();
                    Collections.addAll(arrayList, c4858, new C1309());
                    c2813.f9391 = AbstractC3933.m7074(new C1115(arrayList));
                }
                if (((C3743) c2813.f9392) == null) {
                    c2813.f9392 = new C3743(4, c2813);
                }
                return new C0996((Context) c2813.f9393, (InterfaceC3077) c2813.f9389, (InterfaceC3077) c2813.f9390, (C2391) c2813.f9388, (InterfaceC3077) c2813.f9391, (C3743) c2813.f9392);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                Object obj2 = C0996.f3556;
                return new C2022(new C1543(this.f972, AbstractC4288.f14178, InterfaceC2601.f8692, C1540.f5214));
            default:
                Object obj3 = AbstractC5271.f17369;
                return AbstractC1631.m3423(this.f972);
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public boolean m563() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f972;
        if (callingUid == iMyUid) {
            return AbstractC3933.m7083(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public PackageInfo m564(int i, String str) {
        return this.f972.getPackageManager().getPackageInfo(str, i);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public C4836 m565() {
        Context context = this.f972;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        C4836 c4836 = new C4836();
        c4836.f15929 = C5060.m8606(AbstractC2133.f6995);
        C0334 c0334 = new C0334(context);
        c4836.f15928 = c0334;
        c4836.f15925 = C5060.m8606(new C3369(12, c0334, new C4228(16, c0334)));
        C0334 c0335 = c4836.f15928;
        c4836.f15926 = new C1039(6, c0335);
        int i = 4;
        InterfaceC4895 interfaceC4895M8606 = C5060.m8606(new C2346(i, c4836.f15926, C5060.m8606(new C4228(24, c0335))));
        c4836.f15924 = interfaceC4895M8606;
        C3223 c3223 = new C3223(25);
        C0334 c0336 = c4836.f15928;
        C2808 c2808 = new C2808(c0336, interfaceC4895M8606, c3223, 28);
        InterfaceC4895 interfaceC4895 = c4836.f15929;
        InterfaceC4895 interfaceC4896 = c4836.f15925;
        c4836.f15927 = C5060.m8606(new C5460(new C1414(interfaceC4895, interfaceC4896, c2808, interfaceC4895M8606, interfaceC4895M8606, 2), new C3571(c0336, interfaceC4896, interfaceC4895M8606, c2808, interfaceC4895, interfaceC4895M8606, interfaceC4895M8606), new C1489(interfaceC4895, interfaceC4895M8606, c2808, interfaceC4895M8606, 21), i));
        return c4836;
    }

    public /* synthetic */ C0272(Context context, int i) {
        this.f973 = i;
        this.f972 = context;
    }

    public C0272(Service service) {
        this.f973 = 5;
        Context applicationContext = service.getApplicationContext();
        AbstractC0487.m1047(applicationContext);
        this.f972 = applicationContext;
    }

    public /* synthetic */ C0272() {
        this.f973 = 0;
    }
}
