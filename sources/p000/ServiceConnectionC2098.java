package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: renamed from: ۥٜۗؒۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2098 implements ServiceConnection {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ C3385 f6911;

    /* JADX INFO: renamed from: ۦۨ */
    public final String f6912;

    public ServiceConnectionC2098(C3385 c3385, String str) {
        Objects.requireNonNull(c3385);
        this.f6911 = c3385;
        this.f6912 = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C3385 c3385 = this.f6911;
        if (iBinder == null) {
            C3610 c3610 = c3385.f11283.f17717;
            C5371.m9020(c3610);
            c3610.f12022.m9432("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = AbstractBinderC5875.f19404;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            InterfaceC4498 c5198 = iInterfaceQueryLocalInterface instanceof InterfaceC4498 ? (InterfaceC4498) iInterfaceQueryLocalInterface : new C5198(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            C5371 c5371 = c3385.f11283;
            C3610 c3611 = c5371.f17717;
            C5371.m9020(c3611);
            c3611.f12023.m9432("Install Referrer Service connected");
            C3644 c3644 = c5371.f17733;
            C5371.m9020(c3644);
            c3644.m6515(new RunnableC4985(this, c5198, this));
        } catch (RuntimeException e) {
            C3610 c3612 = c3385.f11283.f17717;
            C5371.m9020(c3612);
            c3612.f12022.m9430(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C3610 c3610 = this.f6911.f11283.f17717;
        C5371.m9020(c3610);
        c3610.f12023.m9432("Install Referrer Service disconnected");
    }
}
