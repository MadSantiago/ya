package p000;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: renamed from: ۦؓؒؓٔ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3156 extends AbstractC0071 {
    public static final Parcelable.Creator<C3156> CREATOR = new C5229(5);

    /* JADX INFO: renamed from: ۥْ */
    public final Intent f10635;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f10636;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f10637;

    public C3156(int i, String str, Intent intent) {
        this.f10637 = i;
        this.f10636 = str;
        this.f10635 = intent;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static C3156 m5837(Activity activity) {
        return new C3156(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3156)) {
            return false;
        }
        C3156 c3156 = (C3156) obj;
        return this.f10637 == c3156.f10637 && Objects.equals(this.f10636, c3156.f10636) && Objects.equals(this.f10635, c3156.f10635);
    }

    public final int hashCode() {
        return this.f10637;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f10637);
        AbstractC4489.m7775(parcel, 2, this.f10636);
        AbstractC4489.m7793(parcel, 3, this.f10635, i);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
