package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥَٜؗؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC0587 extends Binder implements InterfaceC1583 {

    /* JADX INFO: renamed from: ۦۨ */
    public static final /* synthetic */ int f2190 = 0;

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String string = new C4441(new long[]{2426010038825956154L, 9145251376327628832L, 687509243276953908L, -4201755449790483591L, 6532579384058015878L, -6242422890131388900L, 4197944411926741243L}).toString();
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(string);
        }
        if (i == 1598968902) {
            parcel2.writeString(string);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        IBinder iBinderMo1298 = mo1298();
        parcel2.writeNoException();
        parcel2.writeStrongBinder(iBinderMo1298);
        return true;
    }

    @Override // p000.InterfaceC1583
    /* JADX INFO: renamed from: ۥۡ */
    public final IBinder mo1298() {
        BinderC3816 binderC3816;
        synchronized (AbstractC0993.class) {
            binderC3816 = AbstractC0993.f3548;
            if (binderC3816 == null) {
                binderC3816 = new BinderC3816();
                AbstractC0993.f3548 = binderC3816;
            }
        }
        return binderC3816;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
