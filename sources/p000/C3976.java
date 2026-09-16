package p000;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: ۦِٖؕ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3976 extends AbstractC0071 {
    public static final Parcelable.Creator<C3976> CREATOR = new C1432(24);

    /* JADX INFO: renamed from: ۥَ */
    public final boolean f13288;

    /* JADX INFO: renamed from: ۥْ */
    public final C2612 f13289;

    /* JADX INFO: renamed from: ۥٓ */
    public final boolean f13290;

    /* JADX INFO: renamed from: ۦ۟ */
    public final IBinder f13291;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f13292;

    public C3976(int i, IBinder iBinder, C2612 c2612, boolean z, boolean z2) {
        this.f13292 = i;
        this.f13291 = iBinder;
        this.f13289 = c2612;
        this.f13290 = z;
        this.f13288 = z2;
    }

    public final boolean equals(Object obj) {
        Object c5331;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof C3976)) {
                return false;
            }
            C3976 c3976 = (C3976) obj;
            if (!this.f13289.equals(c3976.f13289)) {
                return false;
            }
            Object c5332 = null;
            IBinder iBinder = this.f13291;
            if (iBinder == null) {
                c5331 = null;
            } else {
                int i = AbstractBinderC4339.f14321;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c5331 = iInterfaceQueryLocalInterface instanceof InterfaceC4814 ? (InterfaceC4814) iInterfaceQueryLocalInterface : new C5331(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = c3976.f13291;
            if (iBinder2 != null) {
                int i2 = AbstractBinderC4339.f14321;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                c5332 = iInterfaceQueryLocalInterface2 instanceof InterfaceC4814 ? (InterfaceC4814) iInterfaceQueryLocalInterface2 : new C5331(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!AbstractC2164.m4207(c5331, c5332)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f13292);
        AbstractC4489.m7802(parcel, 2, this.f13291);
        AbstractC4489.m7793(parcel, 3, this.f13289, i);
        AbstractC4489.m7797(parcel, 4, 4);
        parcel.writeInt(this.f13290 ? 1 : 0);
        AbstractC4489.m7797(parcel, 5, 4);
        parcel.writeInt(this.f13288 ? 1 : 0);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
