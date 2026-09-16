package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: ۥٟؓؓٝ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0307 extends AbstractC0071 {
    public static final Parcelable.Creator<C0307> CREATOR = new C1432(17);

    /* JADX INFO: renamed from: ۦ۟ */
    public List f1109;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f1110;

    public C0307(int i, List list) {
        this.f1110 = i;
        this.f1109 = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f1110);
        AbstractC4489.m7794(parcel, 2, this.f1109);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
