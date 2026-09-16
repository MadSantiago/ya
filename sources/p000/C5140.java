package p000;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: ۦٖۙٚ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5140 {

    /* JADX INFO: renamed from: ۥُ */
    public boolean f17023;

    /* JADX INFO: renamed from: ۥّ */
    public Bundle f17024;

    /* JADX INFO: renamed from: ۥۗ */
    public final C0463 f17025;

    /* JADX INFO: renamed from: ۥۣ */
    public final InterfaceC3983 f17027;

    /* JADX INFO: renamed from: ۦۙ */
    public boolean f17029;

    /* JADX INFO: renamed from: ۥؗ */
    public final C4036 f17022 = new C4036(29);

    /* JADX INFO: renamed from: ۦؑ */
    public final LinkedHashMap f17028 = new LinkedHashMap();

    /* JADX INFO: renamed from: ۥۜ */
    public boolean f17026 = true;

    public C5140(InterfaceC3983 interfaceC3983, C0463 c0463) {
        this.f17027 = interfaceC3983;
        this.f17025 = c0463;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8749() {
        InterfaceC3983 interfaceC3983 = this.f17027;
        if (interfaceC3983.mo110().mo2387() != EnumC0458.f1656) {
            C1078.m2276("Restarter must be created only during owner's initialization stage");
        } else {
            if (this.f17023) {
                C1078.m2276("SavedStateRegistry was already attached.");
                return;
            }
            this.f17025.mo449();
            interfaceC3983.mo110().mo2388(new C1375(2, this));
            this.f17023 = true;
        }
    }
}
