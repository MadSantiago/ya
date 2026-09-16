package p000;

import android.content.ComponentName;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashSet;

/* JADX INFO: renamed from: ۥٍؖۦؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0972 extends Binder implements IInterface {

    /* JADX INFO: renamed from: ۥٓ */
    public static final Handler f3431 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: ۥْ */
    public boolean f3432;

    /* JADX INFO: renamed from: ۦ۟ */
    public final ComponentName f3433;

    /* JADX INFO: renamed from: ۦۨ */
    public final HashSet f3434;

    public BinderC0972(C3268 c3268) {
        attachInterface(this, "moe.shizuku.server.IShizukuServiceConnection");
        this.f3434 = new HashSet();
        this.f3432 = false;
        this.f3433 = c3268.f10982;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Handler handler = f3431;
        if (i == 1) {
            parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
            IBinder strongBinder = parcel.readStrongBinder();
            handler.post(new RunnableC5689(21, this, strongBinder));
            try {
                strongBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: ۥٟؕۜؑ
                    @Override // android.os.IBinder.DeathRecipient
                    public final void binderDied() {
                        BinderC0972 binderC0972 = this.f6632;
                        if (binderC0972.f3432) {
                            return;
                        }
                        binderC0972.f3432 = true;
                        BinderC0972.f3431.post(new RunnableC0029(18, binderC0972));
                    }
                }, 0);
            } catch (RemoteException unused) {
            }
        } else {
            if (i != 2) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuServiceConnection");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuServiceConnection");
            if (!this.f3432) {
                this.f3432 = true;
                handler.post(new RunnableC0029(18, this));
                return true;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
