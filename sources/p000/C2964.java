package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: ۦؐؑۦۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2964 implements Parcelable {
    public static final Parcelable.Creator<C2964> CREATOR = new C1432(3);

    /* JADX INFO: renamed from: ۦ۟ */
    public final ArrayList f9941;

    /* JADX INFO: renamed from: ۦۨ */
    public final ArrayList f9942;

    public C2964(Parcel parcel) {
        this.f9942 = parcel.createStringArrayList();
        this.f9941 = parcel.createTypedArrayList(C4983.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f9942);
        parcel.writeTypedList(this.f9941);
    }
}
