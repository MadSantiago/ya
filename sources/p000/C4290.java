package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦًٖٟؓ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C4290 implements Parcelable {
    public static final Parcelable.Creator<C4290> CREATOR = new C1432(7);

    /* JADX INFO: renamed from: ۥَ */
    public String f14181;

    /* JADX INFO: renamed from: ۥْ */
    public C4983[] f14182;

    /* JADX INFO: renamed from: ۥٓ */
    public int f14183;

    /* JADX INFO: renamed from: ۥٖ */
    public ArrayList f14184;

    /* JADX INFO: renamed from: ۦٗ */
    public ArrayList f14185;

    /* JADX INFO: renamed from: ۦۛ */
    public ArrayList f14186;

    /* JADX INFO: renamed from: ۦ۟ */
    public ArrayList f14187;

    /* JADX INFO: renamed from: ۦۨ */
    public ArrayList f14188;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f14188);
        parcel.writeStringList(this.f14187);
        parcel.writeTypedArray(this.f14182, i);
        parcel.writeInt(this.f14183);
        parcel.writeString(this.f14181);
        parcel.writeStringList(this.f14184);
        parcel.writeTypedList(this.f14185);
        parcel.writeTypedList(this.f14186);
    }
}
