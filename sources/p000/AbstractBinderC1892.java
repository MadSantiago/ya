package p000;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥٌؘٝؕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1892 extends Binder implements IInterface {
    public AbstractBinderC1892(String str) {
        attachInterface(this, str);
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return mo479(i, parcel, parcel2);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public abstract boolean mo479(int i, Parcel parcel, Parcel parcel2);

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }
}
