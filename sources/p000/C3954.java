package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ۦٌِؓٞ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3954 extends AbstractC0071 {
    public static final Parcelable.Creator<C3954> CREATOR = new C5229(20);

    /* JADX INFO: renamed from: ۦۨ */
    public final List f13226;

    public C3954(ArrayList arrayList) {
        this.f13226 = arrayList;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C3954 m7110(EnumC1962... enumC1962Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC1962Arr[0].f6473));
        return new C3954(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        List list = this.f13226;
        if (list != null) {
            int iM7801 = AbstractC4489.m7800(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            AbstractC4489.m7790(parcel, iM7801);
        }
        AbstractC4489.m7790(parcel, iM7800);
    }
}
