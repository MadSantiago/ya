package p000;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import java.util.List;

/* JADX INFO: renamed from: ۥۖؗۧۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2081 implements InterfaceC3275 {

    /* JADX INFO: renamed from: ۦ۟ */
    public final /* synthetic */ Object f6863;

    /* JADX INFO: renamed from: ۦۨ */
    public final /* synthetic */ int f6864;

    public /* synthetic */ C2081(int i, Object obj) {
        this.f6864 = i;
        this.f6863 = obj;
    }

    @Override // p000.InterfaceC3275
    /* JADX INFO: renamed from: ۦ۟ */
    public final Object mo1822(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.f6864;
        C2358 c2358 = C2358.f7817;
        Object obj5 = this.f6863;
        switch (i) {
            case 0:
                C5541 c5541 = (C5541) obj5;
                C4879 c4879M2590 = ((C1226) c5541.f18293).m2590((AbstractC0903) obj, (C1626) obj2, ((C5827) obj3).f19197, ((C2848) obj4).f9512);
                if (c4879M2590 instanceof C4879) {
                    return (Typeface) c4879M2590.f16042;
                }
                C5460 c5460 = new C5460(c4879M2590, c5541.f18299);
                c5541.f18299 = c5460;
                return (Typeface) c5460.f18000;
            case 1:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                C0538 c0538 = new C0538(sQLiteQuery);
                C0661 c0661 = (C0661) ((C1039) obj5).f3672;
                int length = c0661.f2440.length;
                for (int i2 = 1; i2 < length; i2++) {
                    int i3 = c0661.f2440[i2];
                    if (i3 == 1) {
                        c0538.mo1232(c0661.f2439[i2], i2);
                    } else if (i3 == 2) {
                        c0538.mo1235(c0661.f2441[i2], i2);
                    } else if (i3 == 3) {
                        c0538.mo1233(i2, c0661.f2443[i2]);
                    } else if (i3 == 4) {
                        c0538.mo1234(i2, c0661.f2444[i2]);
                    } else if (i3 == 5) {
                        c0538.mo1231(i2);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            case C4261.FLOAT_FIELD_NUMBER /* 2 */:
                InterfaceC2609 interfaceC2609 = (InterfaceC2609) obj5;
                C4068 c4068 = (C4068) obj;
                ((Integer) obj2).intValue();
                C5362 c5362 = (C5362) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= c5362.m8963(c4068) ? 4 : 2;
                }
                if (c5362.m9011(iIntValue & 1, (iIntValue & 131) != 130)) {
                    interfaceC2609.mo1173(c4068, c5362, Integer.valueOf(iIntValue & 14));
                } else {
                    c5362.m8982();
                }
                return c2358;
            default:
                List list = (List) obj5;
                int iIntValue2 = ((Integer) obj2).intValue();
                C5362 c5363 = (C5362) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                new C4441(new long[]{4139953479086487407L, -6872619199718161425L, 5860189888919664997L, -2783525100595796484L, -8167203810680045208L, 1340450441334618590L}).toString();
                if ((iIntValue3 & 48) == 0) {
                    iIntValue3 |= c5363.m8988(iIntValue2) ? 32 : 16;
                }
                if (c5363.m9011(iIntValue3 & 1, (iIntValue3 & 145) != 144)) {
                    ((AbstractC4968) list.get(iIntValue2)).f16443.mo219(c5363, 0);
                } else {
                    c5363.m8982();
                }
                return c2358;
        }
    }
}
