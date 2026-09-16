package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥؚؖٛؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0795 extends AbstractC0071 {
    public static final Parcelable.Creator<C0795> CREATOR = new C5229(21);

    /* JADX INFO: renamed from: ۦۨ */
    public final List f2861;

    public C0795(ArrayList arrayList) {
        this.f2861 = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7794(parcel, 1, this.f2861);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
