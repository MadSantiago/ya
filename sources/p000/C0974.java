package p000;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: ۥٍؘْؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0974 implements InterfaceC3865 {

    /* JADX INFO: renamed from: ۦۨ */
    public IBinder f3435;

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3435;
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥؙ */
    public final String[] mo2059(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(9, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.createStringArray();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥِ */
    public final long mo2060(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(20, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥٓ */
    public final C1162 mo2061(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(1, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (C1162) (parcelObtain2.readInt() != 0 ? C1162.f4029.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥٛ */
    public final long mo2062(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(5, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥٞ */
    public final void mo2063(IBinder iBinder) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeStrongBinder(iBinder);
            this.f3435.transact(24, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۖ */
    public final boolean mo2064(long j, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            parcelObtain.writeLong(j);
            this.f3435.transact(13, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۘ */
    public final boolean mo2065(String str, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f3435.transact(17, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۙ */
    public final C1162 mo2066(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(7, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return (C1162) (parcelObtain2.readInt() != 0 ? C1162.f4029.createFromParcel(parcelObtain2) : null);
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۢ */
    public final boolean mo2067(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(14, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۦ */
    public final boolean mo2068(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(2, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۥۧ */
    public final boolean mo2069(int i, String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(i);
            this.f3435.transact(18, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦ */
    public final long mo2070(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(6, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؒ */
    public final boolean mo2071(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(11, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؓ */
    public final boolean mo2072(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(10, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؗ */
    public final boolean mo2073(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(8, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦؚ */
    public final boolean mo2074(String str, String str2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            parcelObtain.writeString(str2);
            this.f3435.transact(12, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦٌ */
    public final boolean mo2075(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(4, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦٕ */
    public final boolean mo2076(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(3, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦٚ */
    public final boolean mo2077(String str, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f3435.transact(16, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦۙ */
    public final long mo2078(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(19, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦۚ */
    public final boolean mo2079(String str, boolean z, boolean z2) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            parcelObtain.writeInt(z ? 1 : 0);
            parcelObtain.writeInt(z2 ? 1 : 0);
            this.f3435.transact(15, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readInt() != 0;
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // p000.InterfaceC3865
    /* JADX INFO: renamed from: ۦ۟ */
    public final long mo2080(String str) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.topjohnwu.superuser.internal.IFileSystemService");
            parcelObtain.writeString(str);
            this.f3435.transact(21, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            return parcelObtain2.readLong();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
