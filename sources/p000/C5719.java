package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: renamed from: ۦۥۣؖؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5719 extends AbstractC4071 {

    /* JADX INFO: renamed from: ۥ٘ */
    public final Bundle f18821;

    /* JADX INFO: renamed from: ۥٛ */
    public final Integer f18822;

    /* JADX INFO: renamed from: ۦۜ */
    public final boolean f18823;

    /* JADX INFO: renamed from: ۦۣ */
    public final C2813 f18824;

    public C5719(Context context, Looper looper, C2813 c2813, Bundle bundle, InterfaceC1895 interfaceC1895, InterfaceC3785 interfaceC3785) {
        super(context, looper, 44, c2813, interfaceC1895, interfaceC3785);
        this.f18823 = true;
        this.f18824 = c2813;
        this.f18821 = bundle;
        this.f18822 = (Integer) c2813.f9392;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥُ */
    public final int mo4540() {
        return 12451000;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۥٓ */
    public final Bundle mo7332() {
        C2813 c2813 = this.f18824;
        boolean zEquals = this.f13813.getPackageName().equals((String) c2813.f9390);
        Bundle bundle = this.f18821;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c2813.f9390);
        }
        return bundle;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦٗ */
    public final String mo4541() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p000.AbstractC4150, p000.InterfaceC0858
    /* JADX INFO: renamed from: ۦۗ */
    public final boolean mo1833() {
        return this.f18823;
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۚ */
    public final IInterface mo4542(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof C5071 ? (C5071) iInterfaceQueryLocalInterface : new C5071(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // p000.AbstractC4150
    /* JADX INFO: renamed from: ۦۛ */
    public final String mo4543() {
        return "com.google.android.gms.signin.service.START";
    }
}
