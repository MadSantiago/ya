package p000;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: ۥؘۨؕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2950 implements InterfaceC0814, InterfaceC3983 {

    /* JADX INFO: renamed from: ۥْ */
    public C2346 f9893;

    /* JADX INFO: renamed from: ۦ۟ */
    public C4170 f9894;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ C5762 f9895;

    public C2950(C5762 c5762) {
        this.f9895 = c5762;
        Object objMo1713 = c5762.mo1713("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objMo1713 instanceof Bundle ? (Bundle) objMo1713 : null;
        if (bundle != null && this.f9893 == null) {
            C2346 c2346 = new C2346(new C5140(this, new C0463(0, this)), 6);
            this.f9893 = c2346;
            c2346.m4398(bundle);
        }
        c5762.mo1714("androidx.savedstate.SavedStateRegistry", new C0101(28, this));
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥؗ */
    public final boolean mo1712(Object obj) {
        return this.f9895.mo1712(obj);
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥُ */
    public final Object mo1713(String str) {
        return this.f9895.mo1713(str);
    }

    @Override // p000.InterfaceC4507
    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC1434 mo110() {
        C4170 c4170 = this.f9894;
        if (c4170 != null) {
            return c4170;
        }
        C4170 c4171 = new C4170(this, false);
        this.f9894 = c4171;
        return c4171;
    }

    @Override // p000.InterfaceC3983
    /* JADX INFO: renamed from: ۥۗ */
    public final C2346 mo648() {
        C2346 c2346 = this.f9893;
        if (c2346 == null) {
            C2346 c2347 = new C2346(new C5140(this, new C0463(0, this)), 6);
            this.f9893 = c2347;
            c2347.m4398(null);
            c2346 = c2347;
        }
        return (C2346) c2346.f7785;
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC0468 mo1714(String str, InterfaceC4448 interfaceC4448) {
        return this.f9895.mo1714(str, interfaceC4448);
    }

    @Override // p000.InterfaceC0814
    /* JADX INFO: renamed from: ۦؑ */
    public final Map mo1715() {
        return this.f9895.mo1715();
    }
}
