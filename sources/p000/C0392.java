package p000;

import android.app.Application;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: ۥٟؔؓۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0392 extends AbstractC4294 {

    /* JADX INFO: renamed from: ۥۗ */
    public final /* synthetic */ String f1451;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0392(C1967 c1967, String str) {
        super(1);
        this.f1451 = str;
    }

    @Override // p000.AbstractC4294
    /* JADX INFO: renamed from: ۥۣ */
    public final void mo917(C1414 c1414) {
        Object c4535;
        try {
            Object[] objArrM3003 = c1414.m3003();
            c4535 = null;
            Object obj = objArrM3003 != null ? objArrM3003[0] : null;
            Application application = obj instanceof Application ? (Application) obj : null;
            if (application != null) {
                Iterator it = C1967.f6502.entrySet().iterator();
                if (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
                try {
                    if (C1967.f6498) {
                        return;
                    }
                    boolean zEquals = C1967.m3847().equals("android");
                    String str = this.f1451;
                    if (zEquals && !str.equals("android")) {
                        return;
                    }
                    C2993 c2993 = C2993.f10066;
                    if (c2993 == null) {
                        c2993 = new C2993();
                        C2993.f10066 = c2993;
                    }
                    c2993.m5585(application, str);
                    C1967.f6498 = true;
                } catch (Throwable unused) {
                }
                c4535 = application;
            }
        } catch (Throwable th) {
            c4535 = new C4535(th);
        }
        Throwable thM405 = AbstractC0183.m405(c4535);
        if (thM405 != null) {
            c1414.m2985(thM405);
        }
    }
}
