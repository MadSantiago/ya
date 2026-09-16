package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.AbstractC0071;
import p000.AbstractC0487;
import p000.AbstractC4489;
import p000.C5229;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends AbstractC0071 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new C5229(3);

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f296;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f297;

    public Scope(int i, String str) {
        AbstractC0487.m1097(str, "scopeUri must not be null or empty");
        this.f297 = i;
        this.f296 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f296.equals(((Scope) obj).f296);
    }

    public final int hashCode() {
        return this.f296.hashCode();
    }

    public final String toString() {
        return this.f296;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f297);
        AbstractC4489.m7775(parcel, 2, this.f296);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
