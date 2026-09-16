package p000;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦؚؑؗؐ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3577 extends Binder implements IInterface {
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            Bundle bundle = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
            AbstractC3310.f11073 = bundle.getInt("shizuku:attach-reply-uid", -1);
            bundle.getInt("shizuku:attach-reply-version", -1);
            IBinder iBinder = AbstractC3310.f11078;
            bundle.getInt("shizuku:attach-reply-patch-version", -1);
            IBinder iBinder2 = AbstractC3310.f11078;
            bundle.getString("shizuku:attach-reply-secontext");
            AbstractC3310.f11079 = bundle.getBoolean("shizuku:attach-reply-permission-granted", false);
            AbstractC3310.f11074 = bundle.getBoolean("shizuku:attach-reply-should-show-request-permission-rationale", false);
            AbstractC3310.m6086();
            return true;
        }
        if (i != 3) {
            if (i != 10001) {
                if (i != 1598968902) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                parcel2.writeString("moe.shizuku.server.IShizukuApplication");
                return true;
            }
            parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
            parcel.readInt();
            parcel.readInt();
            parcel.readString();
            parcel.readInt();
            parcel2.writeNoException();
            return true;
        }
        parcel.enforceInterface("moe.shizuku.server.IShizukuApplication");
        final int i3 = parcel.readInt();
        final int i4 = (parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null).getBoolean("shizuku:request-permission-reply-allowed", false) ? 0 : -1;
        synchronized (AbstractC3310.f11082) {
            try {
                for (final C3741 c3741 : AbstractC3310.f11083) {
                    c3741.getClass();
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        C0300.m631(i3, i4);
                    } else {
                        AbstractC3310.f11080.post(new Runnable() { // from class: ۦؚۗؒۤ
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0300.m631(i3, i4);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
