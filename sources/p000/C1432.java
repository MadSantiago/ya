package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import moe.shizuku.api.BinderContainer;

/* JADX INFO: renamed from: ۥَْٕ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C1432 implements Parcelable.Creator {

    /* JADX INFO: renamed from: ۥۣ */
    public final /* synthetic */ int f4912;

    public /* synthetic */ C1432(int i) {
        this.f4912 = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iM9219 = 0;
        Bundle bundleM9222 = null;
        Account account = null;
        C2612 c2612 = null;
        Intent intent = null;
        ArrayList arrayListM9216 = null;
        switch (this.f4912) {
            case 0:
                return new C2233(parcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(parcel) : null, parcel.readInt());
            case 1:
                C3244 c3244 = new C3244(parcel);
                c3244.f10887 = parcel.readByte() != 0;
                return c3244;
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4983(parcel);
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C2964(parcel);
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                BinderContainer binderContainer = new BinderContainer();
                binderContainer.f365 = parcel.readStrongBinder();
                return binderContainer;
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C2184(parcel.readInt());
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                C5351 c5351 = new C5351();
                c5351.f17619 = parcel.readString();
                c5351.f17618 = parcel.readInt();
                return c5351;
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                C4290 c4290 = new C4290();
                c4290.f14181 = null;
                c4290.f14184 = new ArrayList();
                c4290.f14185 = new ArrayList();
                c4290.f14188 = parcel.createStringArrayList();
                c4290.f14187 = parcel.createStringArrayList();
                c4290.f14182 = (C4983[]) parcel.createTypedArray(C4983.CREATOR);
                c4290.f14183 = parcel.readInt();
                c4290.f14181 = parcel.readString();
                c4290.f14184 = parcel.createStringArrayList();
                c4290.f14185 = parcel.createTypedArrayList(C2964.CREATOR);
                c4290.f14186 = parcel.createTypedArrayList(C5351.CREATOR);
                return c4290;
            case 8:
                return new C5003(parcel);
            case 9:
                return new C1162(parcel);
            case 10:
                C0686 c0686 = new C0686(parcel);
                c0686.f2498 = ((Integer) parcel.readValue(C0686.class.getClassLoader())).intValue();
                return c0686;
            case 11:
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                while (iM9219 < i) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    iM9219++;
                }
                return new C5772(string, linkedHashMap);
            case 12:
                C4295 c4295 = new C4295(parcel);
                c4295.f14206 = parcel.readInt();
                return c4295;
            case 13:
                return new ParcelImpl(parcel);
            case 14:
                return new C0811(parcel.readFloat());
            case 15:
                return new C0169(parcel.readInt());
            case 16:
                return new C0925(parcel.readLong());
            case 17:
                int iM9232 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM9232) {
                    int i2 = parcel.readInt();
                    char c = (char) i2;
                    if (c == 1) {
                        iM9219 = AbstractC5537.m9219(parcel, i2);
                    } else if (c != 2) {
                        AbstractC5537.m9248(parcel, i2);
                    } else {
                        arrayListM9216 = AbstractC5537.m9216(parcel, i2, C2923.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM9232);
                return new C0307(iM9219, arrayListM9216);
            case 18:
                int iM9233 = AbstractC5537.m9232(parcel);
                int iM92110 = 0;
                while (parcel.dataPosition() < iM9233) {
                    int i3 = parcel.readInt();
                    char c2 = (char) i3;
                    if (c2 == 1) {
                        iM9219 = AbstractC5537.m9219(parcel, i3);
                    } else if (c2 == 2) {
                        iM92110 = AbstractC5537.m9219(parcel, i3);
                    } else if (c2 != 3) {
                        AbstractC5537.m9248(parcel, i3);
                    } else {
                        intent = (Intent) AbstractC5537.m9236(parcel, i3, Intent.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM9233);
                return new C0396(iM9219, iM92110, intent);
            case 19:
                int iM9234 = AbstractC5537.m9232(parcel);
                long jM9218 = 0;
                int iM92111 = 0;
                String strM9257 = null;
                String strM9258 = null;
                String strM9259 = null;
                String strM92510 = null;
                Uri uri = null;
                String strM92511 = null;
                String strM92512 = null;
                ArrayList arrayListM9217 = null;
                String strM92513 = null;
                String strM92514 = null;
                while (parcel.dataPosition() < iM9234) {
                    int i4 = parcel.readInt();
                    switch ((char) i4) {
                        case 1:
                            iM92111 = AbstractC5537.m9219(parcel, i4);
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            strM9257 = AbstractC5537.m9257(parcel, i4);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            strM9258 = AbstractC5537.m9257(parcel, i4);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            strM9259 = AbstractC5537.m9257(parcel, i4);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            strM92510 = AbstractC5537.m9257(parcel, i4);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            uri = (Uri) AbstractC5537.m9236(parcel, i4, Uri.CREATOR);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM92511 = AbstractC5537.m9257(parcel, i4);
                            break;
                        case '\b':
                            jM9218 = AbstractC5537.m9218(parcel, i4);
                            break;
                        case '\t':
                            strM92512 = AbstractC5537.m9257(parcel, i4);
                            break;
                        case '\n':
                            arrayListM9217 = AbstractC5537.m9216(parcel, i4, Scope.CREATOR);
                            break;
                        case 11:
                            strM92513 = AbstractC5537.m9257(parcel, i4);
                            break;
                        case '\f':
                            strM92514 = AbstractC5537.m9257(parcel, i4);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i4);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM9234);
                return new GoogleSignInAccount(iM92111, strM9257, strM9258, strM9259, strM92510, uri, strM92511, jM9218, strM92512, arrayListM9217, strM92513, strM92514);
            case 20:
                int iM9235 = AbstractC5537.m9232(parcel);
                ArrayList<String> arrayList = null;
                String strM92515 = null;
                while (parcel.dataPosition() < iM9235) {
                    int i5 = parcel.readInt();
                    char c3 = (char) i5;
                    if (c3 == 1) {
                        int iM9242 = AbstractC5537.m9242(parcel, i5);
                        int iDataPosition = parcel.dataPosition();
                        if (iM9242 == 0) {
                            arrayList = null;
                        } else {
                            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                            parcel.setDataPosition(iDataPosition + iM9242);
                            arrayList = arrayListCreateStringArrayList;
                        }
                    } else if (c3 != 2) {
                        AbstractC5537.m9248(parcel, i5);
                    } else {
                        strM92515 = AbstractC5537.m9257(parcel, i5);
                    }
                }
                AbstractC5537.m9220(parcel, iM9235);
                return new C1598(strM92515, arrayList);
            case 21:
                int iM9236 = AbstractC5537.m9232(parcel);
                C3976 c3976 = null;
                while (parcel.dataPosition() < iM9236) {
                    int i6 = parcel.readInt();
                    char c4 = (char) i6;
                    if (c4 == 1) {
                        iM9219 = AbstractC5537.m9219(parcel, i6);
                    } else if (c4 == 2) {
                        c2612 = (C2612) AbstractC5537.m9236(parcel, i6, C2612.CREATOR);
                    } else if (c4 != 3) {
                        AbstractC5537.m9248(parcel, i6);
                    } else {
                        c3976 = (C3976) AbstractC5537.m9236(parcel, i6, C3976.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM9236);
                return new C2209(iM9219, c2612, c3976);
            case 22:
                int iM9237 = AbstractC5537.m9232(parcel);
                int iM92112 = -1;
                long jM9219 = 0;
                long jM92110 = 0;
                int iM92113 = 0;
                int iM92114 = 0;
                int iM92115 = 0;
                int iM92116 = 0;
                String strM92516 = null;
                String strM92517 = null;
                while (parcel.dataPosition() < iM9237) {
                    int i7 = parcel.readInt();
                    switch ((char) i7) {
                        case 1:
                            iM92113 = AbstractC5537.m9219(parcel, i7);
                            break;
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            iM92114 = AbstractC5537.m9219(parcel, i7);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            iM92115 = AbstractC5537.m9219(parcel, i7);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            jM9219 = AbstractC5537.m9218(parcel, i7);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            jM92110 = AbstractC5537.m9218(parcel, i7);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            strM92516 = AbstractC5537.m9257(parcel, i7);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM92517 = AbstractC5537.m9257(parcel, i7);
                            break;
                        case '\b':
                            iM92116 = AbstractC5537.m9219(parcel, i7);
                            break;
                        case '\t':
                            iM92112 = AbstractC5537.m9219(parcel, i7);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i7);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM9237);
                return new C2923(iM92113, iM92114, iM92115, jM9219, jM92110, strM92516, strM92517, iM92116, iM92112);
            case 23:
                int iM9238 = AbstractC5537.m9232(parcel);
                int iM92117 = 0;
                GoogleSignInAccount googleSignInAccount = null;
                while (parcel.dataPosition() < iM9238) {
                    int i8 = parcel.readInt();
                    char c5 = (char) i8;
                    if (c5 == 1) {
                        iM9219 = AbstractC5537.m9219(parcel, i8);
                    } else if (c5 == 2) {
                        account = (Account) AbstractC5537.m9236(parcel, i8, Account.CREATOR);
                    } else if (c5 == 3) {
                        iM92117 = AbstractC5537.m9219(parcel, i8);
                    } else if (c5 != 4) {
                        AbstractC5537.m9248(parcel, i8);
                    } else {
                        googleSignInAccount = (GoogleSignInAccount) AbstractC5537.m9236(parcel, i8, GoogleSignInAccount.CREATOR);
                    }
                }
                AbstractC5537.m9220(parcel, iM9238);
                return new C3652(iM9219, account, iM92117, googleSignInAccount);
            case 24:
                int iM9239 = AbstractC5537.m9232(parcel);
                int iM92118 = 0;
                boolean zM9234 = false;
                boolean zM9235 = false;
                IBinder iBinderM9241 = null;
                C2612 c2613 = null;
                while (parcel.dataPosition() < iM9239) {
                    int i9 = parcel.readInt();
                    char c6 = (char) i9;
                    if (c6 == 1) {
                        iM92118 = AbstractC5537.m9219(parcel, i9);
                    } else if (c6 == 2) {
                        iBinderM9241 = AbstractC5537.m9241(parcel, i9);
                    } else if (c6 == 3) {
                        c2613 = (C2612) AbstractC5537.m9236(parcel, i9, C2612.CREATOR);
                    } else if (c6 == 4) {
                        zM9234 = AbstractC5537.m9234(parcel, i9);
                    } else if (c6 != 5) {
                        AbstractC5537.m9248(parcel, i9);
                    } else {
                        zM9235 = AbstractC5537.m9234(parcel, i9);
                    }
                }
                AbstractC5537.m9220(parcel, iM9239);
                return new C3976(iM92118, iBinderM9241, c2613, zM9234, zM9235);
            case 25:
                int iM92310 = AbstractC5537.m9232(parcel);
                int iM92119 = 0;
                int iM92120 = 0;
                PendingIntent pendingIntent = null;
                String strM92518 = null;
                Integer numValueOf = null;
                while (parcel.dataPosition() < iM92310) {
                    int i10 = parcel.readInt();
                    char c7 = (char) i10;
                    if (c7 == 1) {
                        iM92119 = AbstractC5537.m9219(parcel, i10);
                    } else if (c7 == 2) {
                        iM92120 = AbstractC5537.m9219(parcel, i10);
                    } else if (c7 == 3) {
                        pendingIntent = (PendingIntent) AbstractC5537.m9236(parcel, i10, PendingIntent.CREATOR);
                    } else if (c7 == 4) {
                        strM92518 = AbstractC5537.m9257(parcel, i10);
                    } else if (c7 != 5) {
                        AbstractC5537.m9248(parcel, i10);
                    } else {
                        int iM9243 = AbstractC5537.m9242(parcel, i10);
                        if (iM9243 == 0) {
                            numValueOf = null;
                        } else {
                            AbstractC5537.m9271(parcel, iM9243, 4);
                            numValueOf = Integer.valueOf(parcel.readInt());
                        }
                    }
                }
                AbstractC5537.m9220(parcel, iM92310);
                return new C2612(iM92119, iM92120, pendingIntent, strM92518, numValueOf);
            case 26:
                int iM92311 = AbstractC5537.m9232(parcel);
                long jM92111 = 0;
                long jM92112 = 0;
                int iM92121 = 0;
                while (parcel.dataPosition() < iM92311) {
                    int i11 = parcel.readInt();
                    char c8 = (char) i11;
                    if (c8 == 1) {
                        jM92111 = AbstractC5537.m9218(parcel, i11);
                    } else if (c8 == 2) {
                        iM92121 = AbstractC5537.m9219(parcel, i11);
                    } else if (c8 != 3) {
                        AbstractC5537.m9248(parcel, i11);
                    } else {
                        jM92112 = AbstractC5537.m9218(parcel, i11);
                    }
                }
                AbstractC5537.m9220(parcel, iM92311);
                return new C0323(iM92121, jM92111, jM92112);
            case 27:
                int iM92312 = AbstractC5537.m9232(parcel);
                int iM92122 = 0;
                boolean zM9236 = false;
                boolean zM9237 = false;
                int iM92123 = 0;
                int iM92124 = 0;
                while (parcel.dataPosition() < iM92312) {
                    int i12 = parcel.readInt();
                    char c9 = (char) i12;
                    if (c9 == 1) {
                        iM92122 = AbstractC5537.m9219(parcel, i12);
                    } else if (c9 == 2) {
                        zM9236 = AbstractC5537.m9234(parcel, i12);
                    } else if (c9 == 3) {
                        zM9237 = AbstractC5537.m9234(parcel, i12);
                    } else if (c9 == 4) {
                        iM92123 = AbstractC5537.m9219(parcel, i12);
                    } else if (c9 != 5) {
                        AbstractC5537.m9248(parcel, i12);
                    } else {
                        iM92124 = AbstractC5537.m9219(parcel, i12);
                    }
                }
                AbstractC5537.m9220(parcel, iM92312);
                return new C0144(iM92122, zM9236, zM9237, iM92123, iM92124);
            case 28:
                int iM92313 = AbstractC5537.m9232(parcel);
                long jM92113 = 0;
                long jM92114 = 0;
                long jM92115 = 0;
                boolean zM9238 = false;
                String strM92519 = null;
                String strM92520 = null;
                C1477 c1477 = null;
                String strM92521 = null;
                C2679 c2679 = null;
                C2679 c26710 = null;
                C2679 c26711 = null;
                while (parcel.dataPosition() < iM92313) {
                    int i13 = parcel.readInt();
                    switch ((char) i13) {
                        case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                            strM92519 = AbstractC5537.m9257(parcel, i13);
                            break;
                        case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                            strM92520 = AbstractC5537.m9257(parcel, i13);
                            break;
                        case C4261.LONG_FIELD_NUMBER /* 4 */:
                            c1477 = (C1477) AbstractC5537.m9236(parcel, i13, C1477.CREATOR);
                            break;
                        case C4261.STRING_FIELD_NUMBER /* 5 */:
                            jM92113 = AbstractC5537.m9218(parcel, i13);
                            break;
                        case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                            zM9238 = AbstractC5537.m9234(parcel, i13);
                            break;
                        case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                            strM92521 = AbstractC5537.m9257(parcel, i13);
                            break;
                        case '\b':
                            c2679 = (C2679) AbstractC5537.m9236(parcel, i13, C2679.CREATOR);
                            break;
                        case '\t':
                            jM92114 = AbstractC5537.m9218(parcel, i13);
                            break;
                        case '\n':
                            c26710 = (C2679) AbstractC5537.m9236(parcel, i13, C2679.CREATOR);
                            break;
                        case 11:
                            jM92115 = AbstractC5537.m9218(parcel, i13);
                            break;
                        case '\f':
                            c26711 = (C2679) AbstractC5537.m9236(parcel, i13, C2679.CREATOR);
                            break;
                        default:
                            AbstractC5537.m9248(parcel, i13);
                            break;
                    }
                }
                AbstractC5537.m9220(parcel, iM92313);
                return new C1513(strM92519, strM92520, c1477, jM92113, zM9238, strM92521, c2679, jM92114, c26710, jM92115, c26711);
            default:
                int iM92314 = AbstractC5537.m9232(parcel);
                while (parcel.dataPosition() < iM92314) {
                    int i14 = parcel.readInt();
                    if (((char) i14) != 1) {
                        AbstractC5537.m9248(parcel, i14);
                    } else {
                        bundleM9222 = AbstractC5537.m9222(parcel, i14);
                    }
                }
                AbstractC5537.m9220(parcel, iM92314);
                return new C1103(bundleM9222);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f4912) {
            case 0:
                return new C2233[i];
            case 1:
                return new C3244[i];
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                return new C4983[i];
            case C4261.INTEGER_FIELD_NUMBER /* 3 */:
                return new C2964[i];
            case C4261.LONG_FIELD_NUMBER /* 4 */:
                return new BinderContainer[i];
            case C4261.STRING_FIELD_NUMBER /* 5 */:
                return new C2184[i];
            case C4261.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C5351[i];
            case C4261.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C4290[i];
            case 8:
                return new C5003[i];
            case 9:
                return new C1162[i];
            case 10:
                return new C0686[i];
            case 11:
                return new C5772[i];
            case 12:
                return new C4295[i];
            case 13:
                return new ParcelImpl[i];
            case 14:
                return new C0811[i];
            case 15:
                return new C0169[i];
            case 16:
                return new C0925[i];
            case 17:
                return new C0307[i];
            case 18:
                return new C0396[i];
            case 19:
                return new GoogleSignInAccount[i];
            case 20:
                return new C1598[i];
            case 21:
                return new C2209[i];
            case 22:
                return new C2923[i];
            case 23:
                return new C3652[i];
            case 24:
                return new C3976[i];
            case 25:
                return new C2612[i];
            case 26:
                return new C0323[i];
            case 27:
                return new C0144[i];
            case 28:
                return new C1513[i];
            default:
                return new C1103[i];
        }
    }
}
