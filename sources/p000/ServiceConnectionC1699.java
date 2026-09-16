package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: ۥؚٚؑ٘, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1699 implements ServiceConnection {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ AbstractC4150 f5663;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f5664;

    public ServiceConnectionC1699(AbstractC4150 abstractC4150, int i) {
        this.f5663 = abstractC4150;
        this.f5664 = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        AbstractC4150 abstractC4150 = this.f5663;
        if (iBinder == null) {
            synchronized (abstractC4150.f13827) {
                i = abstractC4150.f13821;
            }
            if (i == 3) {
                abstractC4150.f13820 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            HandlerC1711 handlerC1711 = abstractC4150.f13816;
            handlerC1711.sendMessage(handlerC1711.obtainMessage(i2, abstractC4150.f13825.get(), 16));
            return;
        }
        synchronized (abstractC4150.f13829) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                abstractC4150.f13818 = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof C5205)) ? new C5205(iBinder) : (C5205) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC4150 abstractC4151 = this.f5663;
        int i3 = this.f5664;
        C0947 c0947 = new C0947(abstractC4151, 0, null);
        HandlerC1711 handlerC1712 = abstractC4151.f13816;
        handlerC1712.sendMessage(handlerC1712.obtainMessage(7, i3, -1, c0947));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        AbstractC4150 abstractC4150 = this.f5663;
        synchronized (abstractC4150.f13829) {
            abstractC4150.f13818 = null;
        }
        AbstractC4150 abstractC4151 = this.f5663;
        int i = this.f5664;
        HandlerC1711 handlerC1711 = abstractC4151.f13816;
        handlerC1711.sendMessage(handlerC1711.obtainMessage(6, i, 1));
    }
}
