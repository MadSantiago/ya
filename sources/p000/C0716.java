package p000;

import android.content.ComponentName;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥؙؓٚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0716 implements InterfaceC2585 {

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f2621;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f2621;
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۥؕ */
    public final void mo1581(int i, ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            parcelObtain.writeInt(-1);
            this.f2621.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۥٕ */
    public final void mo1582(ComponentName componentName) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            if (componentName != null) {
                parcelObtain.writeInt(1);
                componentName.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2621.transact(5, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۥٝ */
    public final void mo1583(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            parcelObtain.writeStrongBinder(iBinder);
            this.f2621.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC2585
    /* JADX INFO: renamed from: ۦٟ */
    public final IBinder mo1584(Intent intent) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IRootServiceManager");
            if (intent != null) {
                parcelObtain.writeInt(1);
                intent.writeToParcel(parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.f2621.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readStrongBinder();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
