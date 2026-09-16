package p000;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: renamed from: ۥٌٟۚؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2267 implements InterfaceC2615 {

    /* JADX INFO: renamed from: ۥۣ */
    public final Bundle f7524;

    public C2267(Context context) {
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f7524 = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۥؗ */
    public final Object mo4314(InterfaceC0443 interfaceC0443) {
        return C2358.f7817;
    }

    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۥۗ */
    public final Double mo4315() {
        Bundle bundle = this.f7524;
        if (bundle.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(bundle.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۥۣ */
    public final Boolean mo4316() {
        Bundle bundle = this.f7524;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override // p000.InterfaceC2615
    /* JADX INFO: renamed from: ۦؑ */
    public final C5805 mo4317() {
        Bundle bundle = this.f7524;
        if (bundle.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return new C5805(AbstractC4009.m7166(bundle.getInt("firebase_sessions_sessions_restart_timeout"), EnumC3021.SECONDS));
        }
        return null;
    }
}
