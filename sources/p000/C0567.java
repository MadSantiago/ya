package p000;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: renamed from: ۥّؖۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0567 {

    /* JADX INFO: renamed from: ۥؗ */
    public final HashMap f2040;

    /* JADX INFO: renamed from: ۥۗ */
    public final C2808 f2041;

    /* JADX INFO: renamed from: ۥۣ */
    public final C3369 f2042;

    public C0567(Context context, C2808 c2808) {
        C3369 c3369 = new C3369(context);
        this.f2040 = new HashMap();
        this.f2042 = c3369;
        this.f2041 = c2808;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized InterfaceC3586 m1268(String str) {
        if (this.f2040.containsKey(str)) {
            return (InterfaceC3586) this.f2040.get(str);
        }
        CctBackendFactory cctBackendFactoryM6130 = this.f2042.m6130(str);
        if (cctBackendFactoryM6130 == null) {
            return null;
        }
        C2808 c2808 = this.f2041;
        InterfaceC3586 interfaceC3586Create = cctBackendFactoryM6130.create(new C2738((Context) c2808.f9378, (InterfaceC5375) c2808.f9376, (InterfaceC5375) c2808.f9377, str));
        this.f2040.put(str, interfaceC3586Create);
        return interfaceC3586Create;
    }
}
