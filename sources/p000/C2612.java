package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: ۥۣۢؓؗ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2612 extends AbstractC0071 {

    /* JADX INFO: renamed from: ۥَ */
    public final Integer f8710;

    /* JADX INFO: renamed from: ۥْ */
    public final PendingIntent f8711;

    /* JADX INFO: renamed from: ۥٓ */
    public final String f8712;

    /* JADX INFO: renamed from: ۦ۟ */
    public final int f8713;

    /* JADX INFO: renamed from: ۦۨ */
    public final int f8714;

    /* JADX INFO: renamed from: ۥٖ */
    public static final C2612 f8709 = new C2612(0, null, null);
    public static final Parcelable.Creator<C2612> CREATOR = new C1432(25);

    public C2612(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
        this.f8714 = i;
        this.f8713 = i2;
        this.f8711 = pendingIntent;
        this.f8712 = str;
        this.f8710 = num;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static String m4943(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return "SERVICE_DISABLED";
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2612)) {
            return false;
        }
        C2612 c2612 = (C2612) obj;
        return this.f8713 == c2612.f8713 && AbstractC2164.m4207(this.f8711, c2612.f8711) && AbstractC2164.m4207(this.f8712, c2612.f8712) && AbstractC2164.m4207(this.f8710, c2612.f8710);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f8713), this.f8711, this.f8712, this.f8710});
    }

    public final String toString() {
        C3369 c3369 = new C3369(this);
        c3369.m6135(m4943(this.f8713), "statusCode");
        c3369.m6135(this.f8711, "resolution");
        c3369.m6135(this.f8712, "message");
        c3369.m6135(this.f8710, "clientMethodKey");
        return c3369.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM7800 = AbstractC4489.m7800(parcel, 20293);
        AbstractC4489.m7797(parcel, 1, 4);
        parcel.writeInt(this.f8714);
        AbstractC4489.m7797(parcel, 2, 4);
        parcel.writeInt(this.f8713);
        AbstractC4489.m7793(parcel, 3, this.f8711, i);
        AbstractC4489.m7775(parcel, 4, this.f8712);
        Integer num = this.f8710;
        if (num != null) {
            AbstractC4489.m7797(parcel, 5, 4);
            parcel.writeInt(num.intValue());
        }
        AbstractC4489.m7790(parcel, iM7800);
    }

    public C2612(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str, null);
    }
}
