package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۥٕٟ٘ؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1598 extends AbstractC0071 {
    public static final Parcelable.Creator<C1598> CREATOR = new C1432(20);

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f5367;

    /* JADX INFO: renamed from: ۦۨ */
    public final List f5368;

    public C1598(String str, ArrayList arrayList) {
        this.f5368 = arrayList;
        this.f5367 = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        List<String> list = this.f5368;
        if (list != null) {
            int iM7801 = AbstractC4489.m7800(parcel, 1);
            parcel.writeStringList(list);
            AbstractC4489.m7790(parcel, iM7801);
        }
        AbstractC4489.m7775(parcel, 2, this.f5367);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
