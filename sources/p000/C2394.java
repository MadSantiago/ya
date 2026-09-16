package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: ۥًۜؖۥ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C2394 {

    /* JADX INFO: renamed from: ۥؗ */
    public final Object f7964;

    /* JADX INFO: renamed from: ۥۗ */
    public final Object f7965;

    /* JADX INFO: renamed from: ۥۣ */
    public long f7966;

    public C2394(C1159 c1159, String str, long j) {
        this.f7964 = c1159;
        AbstractC0487.m1090(str);
        this.f7965 = str;
        this.f7966 = c1159.m2468(-1L, "select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str, String.valueOf(j)});
    }

    /* JADX INFO: renamed from: ۥۗ */
    public List m4513() {
        List list;
        List list2;
        C1159 c1159 = (C1159) this.f7964;
        C5371 c5371 = (C5371) c1159.f18660;
        ArrayList arrayList = new ArrayList();
        String str = (String) this.f7965;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = c1159.m2463().query("raw_events", new String[]{"rowid", "name", "timestamp", "metadata_fingerprint", "data", "realtime", "elapsed_time"}, "app_id = ? and rowid > ?", new String[]{str, String.valueOf(this.f7966)}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    do {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(3);
                        boolean z = cursorQuery.getLong(5) == 1;
                        long j3 = cursorQuery.getLong(6);
                        byte[] blob = cursorQuery.getBlob(4);
                        if (j > this.f7966) {
                            this.f7966 = j;
                        }
                        try {
                            C4102 c4102 = (C4102) C3117.m5718(C5580.m9403(), blob);
                            String string = cursorQuery.getString(1);
                            if (string == null) {
                                string = "";
                            }
                            c4102.m7290(string);
                            long j4 = cursorQuery.getLong(2);
                            c4102.m1979();
                            ((C5580) c4102.f3388).m9429(j4);
                            c4102.m1979();
                            ((C5580) c4102.f3388).m9409(j3);
                            arrayList.add(new C1578(j, j2, z, (C5580) c4102.m1977()));
                        } catch (IOException e) {
                            C3610 c3610 = c5371.f17717;
                            C5371.m9020(c3610);
                            c3610.f12020.m9434(C3610.m6440(str), e, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery.moveToNext());
                    list = arrayList;
                } else {
                    list2 = Collections.EMPTY_LIST;
                }
            } catch (SQLiteException e2) {
                C3610 c3611 = c5371.f17717;
                C5371.m9020(c3611);
                c3611.f12020.m9434(C3610.m6440(str), e2, "Data loss. Error querying raw events batch. appId");
                list = arrayList;
            }
            list = list2;
            return list;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public void m4514(long j, long j2) {
        ((C5426) this.f7965).m9102(Float.intBitsToFloat((int) (j2 >> 32)), j);
        ((C5426) this.f7964).m9102(Float.intBitsToFloat((int) (j2 & 4294967295L)), j);
    }

    public C2394(C1159 c1159, String str) {
        this.f7964 = c1159;
        AbstractC0487.m1090(str);
        this.f7965 = str;
        this.f7966 = -1L;
    }

    public C2394() {
        this.f7965 = new C5426();
        this.f7964 = new C5426();
    }
}
