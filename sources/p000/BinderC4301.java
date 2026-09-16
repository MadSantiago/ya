package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: renamed from: ۦٖٟؕؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC4301 extends Binder implements InterfaceC2376 {

    /* JADX INFO: renamed from: ۦ۟ */
    public static final /* synthetic */ int f14229 = 0;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ MultiInstanceInvalidationService f14230;

    public BinderC4301(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f14230 = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC2376.f7866);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC2376.f7866;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC5457 interfaceC5457 = null;
        InterfaceC5457 interfaceC5458 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC5457.f17993);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC5457)) {
                    C1363 c1363 = new C1363();
                    c1363.f4682 = strongBinder;
                    interfaceC5457 = c1363;
                } else {
                    interfaceC5457 = (InterfaceC5457) iInterfaceQueryLocalInterface;
                }
            }
            int iMo4450 = mo4450(interfaceC5457, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iMo4450);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            mo4449(parcel.readInt(), parcel.createStringArray());
            return true;
        }
        IBinder strongBinder2 = parcel.readStrongBinder();
        if (strongBinder2 != null) {
            IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC5457.f17993);
            if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC5457)) {
                C1363 c1364 = new C1363();
                c1364.f4682 = strongBinder2;
                interfaceC5458 = c1364;
            } else {
                interfaceC5458 = (InterfaceC5457) iInterfaceQueryLocalInterface2;
            }
        }
        int i3 = parcel.readInt();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f14230;
        synchronized (multiInstanceInvalidationService.f238) {
            multiInstanceInvalidationService.f238.unregister(interfaceC5458);
        }
        parcel2.writeNoException();
        return true;
    }

    @Override // p000.InterfaceC2376
    /* JADX INFO: renamed from: ۥؚ */
    public final void mo4449(int i, String[] strArr) {
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f14230;
        synchronized (multiInstanceInvalidationService.f238) {
            try {
                String str = (String) multiInstanceInvalidationService.f240.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.f238.beginBroadcast();
                int i2 = 0;
                while (true) {
                    RemoteCallbackListC4279 remoteCallbackListC4279 = multiInstanceInvalidationService.f238;
                    if (i2 >= iBeginBroadcast) {
                        remoteCallbackListC4279.finishBroadcast();
                        return;
                    }
                    try {
                        Integer num = (Integer) remoteCallbackListC4279.getBroadcastCookie(i2);
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.f240.get(num);
                        if (i != iIntValue && str.equals(str2)) {
                            try {
                                ((InterfaceC5457) multiInstanceInvalidationService.f238.getBroadcastItem(i2)).mo2867(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.f238.finishBroadcast();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.InterfaceC2376
    /* JADX INFO: renamed from: ۥً */
    public final int mo4450(InterfaceC5457 interfaceC5457, String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.f14230;
        synchronized (multiInstanceInvalidationService.f238) {
            try {
                int i2 = multiInstanceInvalidationService.f241 + 1;
                multiInstanceInvalidationService.f241 = i2;
                if (multiInstanceInvalidationService.f238.register(interfaceC5457, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.f240.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.f241--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
