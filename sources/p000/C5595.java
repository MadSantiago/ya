package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۦۣؓۖؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5595 implements InterfaceC1119 {

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f18438;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f18438;
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final int m9435(BinderC0972 binderC0972, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            if (binderC0972 == null) {
                binderC0972 = null;
            }
            parcelObtain.writeStrongBinder(binderC0972);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f18438.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥٍ */
    public final void m9436() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            parcelObtain.writeInt(1001);
            this.f18438.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final int m9437() {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            this.f18438.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final int m9438(BinderC0972 binderC0972, Bundle bundle) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("moe.shizuku.server.IShizukuService");
            parcelObtain.writeStrongBinder(binderC0972);
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            this.f18438.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
