package p000;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: ۥۣۧؔۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2869 implements InterfaceC2895 {

    /* JADX INFO: renamed from: ۥؗ */
    public Bundle f9585;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f9586;

    /* JADX INFO: renamed from: ۥۣ */
    public final C2346 f9587;

    /* JADX INFO: renamed from: ۦؑ */
    public final C2432 f9588;

    public C2869(C2346 c2346, InterfaceC4680 interfaceC4680) {
        this.f9587 = c2346;
        this.f9588 = new C2432(new C0101(29, interfaceC4680));
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m5437() {
        if (this.f9586) {
            return;
        }
        Bundle bundleM4415 = this.f9587.m4415("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM7904 = AbstractC4554.m7904((C3869[]) Arrays.copyOf(new C3869[0], 0));
        Bundle bundle = this.f9585;
        if (bundle != null) {
            bundleM7904.putAll(bundle);
        }
        if (bundleM4415 != null) {
            bundleM7904.putAll(bundleM4415);
        }
        this.f9585 = bundleM7904;
        this.f9586 = true;
    }

    @Override // p000.InterfaceC2895
    /* JADX INFO: renamed from: ۥۣ */
    public final Bundle mo5438() {
        Bundle bundleM7904 = AbstractC4554.m7904((C3869[]) Arrays.copyOf(new C3869[0], 0));
        Bundle bundle = this.f9585;
        if (bundle != null) {
            bundleM7904.putAll(bundle);
        }
        for (Map.Entry entry : ((C1183) this.f9588.getValue()).f4070.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleMo5438 = ((C5444) ((C1106) entry.getValue()).f3892.f4870).mo5438();
            if (!bundleMo5438.isEmpty()) {
                bundleM7904.putBundle(str, bundleMo5438);
            }
        }
        this.f9586 = false;
        return bundleM7904;
    }
}
