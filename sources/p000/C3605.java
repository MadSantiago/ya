package p000;

import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: renamed from: ۦؚؕۛۛ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3605 extends AbstractC5633 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C2441 f12006;

    /* JADX INFO: renamed from: ۥۗ */
    public final Set f12007;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3605(String str) {
        super(str);
        Level level = Level.ALL;
        this.f12007 = C3174.f10665;
        this.f12006 = C3174.f10667;
    }

    @Override // p000.AbstractC5633
    /* JADX INFO: renamed from: ۥۗ */
    public final void mo4097(C2380 c2380) {
        String strMo1508 = (String) c2380.m4459().mo1148(InterfaceC1388.f4743);
        if (strMo1508 == null) {
            strMo1508 = this.f18563;
        }
        if (strMo1508 == null) {
            AbstractC0897 abstractC0897 = c2380.f7893;
            if (abstractC0897 == null) {
                C1078.m2276("cannot request log site information prior to postProcess()");
                return;
            }
            strMo1508 = abstractC0897.mo1508();
            int iIndexOf = strMo1508.indexOf(36, strMo1508.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strMo1508 = strMo1508.substring(0, iIndexOf);
            }
        }
        C3174.m5852(c2380, AbstractC4554.m7930(strMo1508), Level.ALL, this.f12007, this.f12006);
    }

    @Override // p000.AbstractC5633
    /* JADX INFO: renamed from: ۥۣ */
    public final boolean mo4098(Level level) {
        return true;
    }
}
