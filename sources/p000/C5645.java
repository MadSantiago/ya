package p000;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦُۤؓۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C5645 extends AbstractC0071 implements Iterable {
    public static final Parcelable.Creator<C5645> CREATOR = new C5229(1);

    /* JADX INFO: renamed from: ۦۨ */
    public final Bundle f18597;

    public C5645(Bundle bundle) {
        this.f18597 = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1049(this);
    }

    public final String toString() {
        return this.f18597.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7784(parcel, 2, m9478());
        AbstractC4489.m7790(parcel, iM7800);
    }

    /* JADX INFO: renamed from: ۥُ */
    public final String m9477() {
        return this.f18597.getString("currency");
    }

    /* JADX INFO: renamed from: ۥّ */
    public final Bundle m9478() {
        return new Bundle(this.f18597);
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final Object m9479(String str) {
        return this.f18597.get(str);
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final Double m9480() {
        return Double.valueOf(this.f18597.getDouble("value"));
    }
}
