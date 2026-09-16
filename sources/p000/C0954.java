package p000;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: renamed from: ۥٍؔۗؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0954 {

    /* JADX INFO: renamed from: ۥۗ */
    public static final /* synthetic */ int f3386 = 0;

    /* JADX INFO: renamed from: ۥۣ */
    public C1414 f3387;

    static {
        new LinkedHashMap();
    }

    public final String toString() {
        return "HookParam(" + super.toString() + ") by " + this.f3387;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final Object m1970() {
        return ((C2263) this.f3387.f4867).mo219(null, Boolean.FALSE);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object[] m1971() {
        Object[] objArrM3003 = this.f3387.m3003();
        if (objArrM3003 != null) {
            return objArrM3003;
        }
        C1078.m2276("Current hooked Member args is null");
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final Object m1972() {
        Object c4535;
        Object[] objArrM1971 = m1971();
        Object[] objArrCopyOf = Arrays.copyOf(objArrM1971, objArrM1971.length);
        C1414 c1414 = this.f3387;
        Member member = (Member) ((C0514) c1414.f4871).mo449();
        if (member == null) {
            C1078.m2276("Current hooked Member is null");
            return null;
        }
        try {
            c4535 = AbstractC3801.m6779(member, ((C0514) c1414.f4868).f1837.thisObject, objArrCopyOf);
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            String message = thM405.getMessage();
            if (message != null && AbstractC0684.m1527(message.toLowerCase(Locale.ROOT), "wrong number of arguments", false)) {
                String message2 = thM405.getMessage();
                if (message2 == null) {
                    message2 = thM405.toString();
                }
                C1078.m2278(message2);
                return null;
            }
            ArrayList arrayList = C2503.f8322;
            C2503.m4657(4, "Invoke original Member [" + member + "] failed", thM405);
        }
        if (c4535 instanceof C4535) {
            return null;
        }
        return c4535;
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1973(Object obj) {
        ((C2263) this.f3387.f4867).mo219(obj, Boolean.TRUE);
    }
}
