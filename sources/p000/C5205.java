package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦۛؑؖۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5205 implements IInterface {

    /* JADX INFO: renamed from: ۦۨ */
    public final IBinder f17202;

    public C5205(IBinder iBinder) {
        this.f17202 = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f17202;
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final void m8805(BinderC1065 binderC1065, C4990 c4990) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(binderC1065);
            parcelObtain.writeInt(1);
            C5229.m8860(c4990, parcelObtain, 0);
            this.f17202.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
