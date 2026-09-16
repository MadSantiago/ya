package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import ru.bluecat.yandexmapspatcher.bridge.ShizukuService;

/* JADX INFO: renamed from: ۥَۗؔؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC2110 implements ServiceConnection {

    /* JADX INFO: renamed from: ۦ۟ */
    public Object f6933;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6934;

    public ServiceConnectionC2110(C5024 c5024) {
        this.f6934 = 1;
        this.f6933 = c5024;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        InterfaceC1583 interfaceC1583;
        InterfaceC3865 interfaceC3865;
        InterfaceC2376 interfaceC2376;
        InterfaceC1897 interfaceC1897;
        switch (this.f6934) {
            case 0:
                if (iBinder != null) {
                    iBinder.pingBinder();
                    int i = BinderC0587.f2190;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(new C4441(new long[]{7683399121716186928L, -5526676726392488830L, -1416463302417367625L, -1019891887034791240L, 2384979909800107316L, 5807224301397108509L, -3704816841772108714L}).toString());
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1583)) {
                        C4685 c4685 = new C4685();
                        c4685.f15431 = iBinder;
                        interfaceC1583 = c4685;
                    } else {
                        interfaceC1583 = (InterfaceC1583) iInterfaceQueryLocalInterface;
                    }
                    IBinder iBinderMo1298 = interfaceC1583.mo1298();
                    int i2 = BinderC3816.f12641;
                    if (iBinderMo1298 == null) {
                        interfaceC3865 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface2 = iBinderMo1298.queryLocalInterface("com.topjohnwu.superuser.internal.IFileSystemService");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC3865)) {
                            C0974 c0974 = new C0974();
                            c0974.f3435 = iBinderMo1298;
                            interfaceC3865 = c0974;
                        } else {
                            interfaceC3865 = (InterfaceC3865) iInterfaceQueryLocalInterface2;
                        }
                    }
                    if (interfaceC3865 == null) {
                        C1078.m2272("The IBinder provided is invalid");
                    } else {
                        interfaceC3865.mo2063(new Binder());
                        this.f6933 = new C5259(interfaceC3865);
                    }
                }
                break;
            case 1:
                C5024 c5024 = (C5024) this.f6933;
                int i3 = BinderC4301.f14229;
                IInterface iInterfaceQueryLocalInterface3 = iBinder.queryLocalInterface(InterfaceC2376.f7866);
                if (iInterfaceQueryLocalInterface3 == null || !(iInterfaceQueryLocalInterface3 instanceof InterfaceC2376)) {
                    C5616 c5616 = new C5616();
                    c5616.f18507 = iBinder;
                    interfaceC2376 = c5616;
                } else {
                    interfaceC2376 = (InterfaceC2376) iInterfaceQueryLocalInterface3;
                }
                c5024.f16633 = interfaceC2376;
                try {
                    c5024.f16625 = interfaceC2376.mo4450(c5024.f16630, c5024.f16628);
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                    return;
                }
                break;
            default:
                if (iBinder != null) {
                    iBinder.pingBinder();
                    int i4 = ShizukuService.f401;
                    IInterface iInterfaceQueryLocalInterface4 = iBinder.queryLocalInterface(new C4441(new long[]{-5294499424265870511L, 8610621760332305841L, 9067201484445284304L, 1578320942668228146L, 2440157226190870536L, -4855700893629959042L, -4420639722320725099L}).toString());
                    if (iInterfaceQueryLocalInterface4 == null || !(iInterfaceQueryLocalInterface4 instanceof InterfaceC1897)) {
                        C3150 c3150 = new C3150();
                        c3150.f10630 = iBinder;
                        interfaceC1897 = c3150;
                    } else {
                        interfaceC1897 = (InterfaceC1897) iInterfaceQueryLocalInterface4;
                    }
                    this.f6933 = interfaceC1897;
                }
                break;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.f6934) {
            case 0:
                this.f6933 = null;
                break;
            case 1:
                ((C5024) this.f6933).f16633 = null;
                break;
            default:
                this.f6933 = null;
                break;
        }
    }

    public /* synthetic */ ServiceConnectionC2110(int i) {
        this.f6934 = i;
    }
}
