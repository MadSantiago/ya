package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import p000.AbstractC0071;
import p000.AbstractC2164;
import p000.AbstractC4489;
import p000.AbstractC5078;
import p000.C2612;
import p000.C3369;
import p000.C4261;
import p000.C5229;

/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractC0071 implements ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new C5229(6);

    /* JADX INFO: renamed from: ۥْ */
    public final PendingIntent f298;

    /* JADX INFO: renamed from: ۥٓ */
    public final C2612 f299;

    /* JADX INFO: renamed from: ۦ۟ */
    public final String f300;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f301;

    public Status(int i, String str, PendingIntent pendingIntent, C2612 c2612) {
        this.f301 = i;
        this.f300 = str;
        this.f298 = pendingIntent;
        this.f299 = c2612;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f301 == status.f301 && AbstractC2164.m4207(this.f300, status.f300) && AbstractC2164.m4207(this.f298, status.f298) && AbstractC2164.m4207(this.f299, status.f299);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f301), this.f300, this.f298, this.f299});
    }

    public final String toString() {
        C3369 c3369 = new C3369(this);
        String strM8673 = this.f300;
        if (strM8673 == null) {
            int i = this.f301;
            switch (i) {
                case -1:
                    strM8673 = "SUCCESS_CACHE";
                    break;
                case 0:
                    strM8673 = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    strM8673 = AbstractC5078.m8673(i, "unknown status code: ", new StringBuilder(String.valueOf(i).length() + 21));
                    break;
                case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                    strM8673 = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                    strM8673 = "SERVICE_DISABLED";
                    break;
                case C4261.LONG_FIELD_NUMBER /* 4 */:
                    strM8673 = "SIGN_IN_REQUIRED";
                    break;
                case C4261.STRING_FIELD_NUMBER /* 5 */:
                    strM8673 = "INVALID_ACCOUNT";
                    break;
                case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                    strM8673 = "RESOLUTION_REQUIRED";
                    break;
                case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                    strM8673 = "NETWORK_ERROR";
                    break;
                case 8:
                    strM8673 = "INTERNAL_ERROR";
                    break;
                case 10:
                    strM8673 = "DEVELOPER_ERROR";
                    break;
                case 13:
                    strM8673 = "ERROR";
                    break;
                case 14:
                    strM8673 = "INTERRUPTED";
                    break;
                case 15:
                    strM8673 = "TIMEOUT";
                    break;
                case 16:
                    strM8673 = "CANCELED";
                    break;
                case 17:
                    strM8673 = "API_NOT_CONNECTED";
                    break;
                case 18:
                    strM8673 = "DEAD_CLIENT";
                    break;
                case 19:
                    strM8673 = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    strM8673 = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    strM8673 = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case 22:
                    strM8673 = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        c3369.m6135(strM8673, "statusCode");
        c3369.m6135(this.f298, "resolution");
        return c3369.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f301);
        AbstractC4489.m7775(parcel, 2, this.f300);
        AbstractC4489.m7793(parcel, 3, this.f298, i);
        AbstractC4489.m7793(parcel, 4, this.f299, i);
        AbstractC4489.m7790(parcel, iM7800);
    }
}
