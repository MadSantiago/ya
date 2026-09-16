package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: ۥؘؙؗؖ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C0615 {

    /* JADX INFO: renamed from: ۥؗ */
    public Object f2294;

    /* JADX INFO: renamed from: ۥۗ */
    public Object f2295;

    /* JADX INFO: renamed from: ۥۣ */
    public long f2296;

    /* JADX INFO: renamed from: ۦؑ */
    public final Object f2297;

    public C0615(C2680 c2680) {
        this.f2296 = 300000000000L;
        this.f2295 = c2680.m4989();
        this.f2294 = new C1841(this, AbstractC3761.m6621(new StringBuilder(), AbstractC4031.f13453, " ConnectionPool"));
        this.f2297 = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00fe A[PHI: r7 r16 r17
  0x00fe: PHI (r7v1 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r16v5 ۦۣؒؒۢ) = (r16v7 ۦۣؒؒۢ), (r16v11 ۦۣؒؒۢ) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]
  0x00fe: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x0129, B:46:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v33, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r0v79 */
    /* JADX INFO: renamed from: ۥؗ */
    public C5580 m1379(String str, C5580 c5580) throws Throwable {
        Cursor cursor;
        C5580 c5581;
        long j;
        Cursor cursorRawQuery;
        ?? r0;
        Object obj;
        Pair pair;
        String strM9415 = c5580.m9415();
        List listM9411 = c5580.m9411();
        C1419 c1419 = (C1419) this.f2297;
        C5034 c5034 = c1419.f19371;
        C5371 c5371 = (C5371) c1419.f18660;
        c5034.m8505();
        C5057 c5057M5697 = C3117.m5697("_eid", c5580);
        Long l = (Long) (c5057M5697 == null ? null : C3117.m5708(c5057M5697));
        if (l != null) {
            if (strM9415.equals("_ep")) {
                c5034.m8505();
                C5057 c5057M5698 = C3117.m5697("_en", c5580);
                String str2 = (String) (c5057M5698 == null ? null : C3117.m5708(c5057M5698));
                if (TextUtils.isEmpty(str2)) {
                    C3610 c3610 = c5371.f17717;
                    C5371.m9020(c3610);
                    c3610.f12025.m9430(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((C5580) this.f2295) == null || ((Long) this.f2294) == null || l.longValue() != ((Long) this.f2294).longValue()) {
                    C1159 c1159 = c5034.f16670;
                    C5034.m8484(c1159);
                    C5371 c5372 = (C5371) c1159.f18660;
                    c1159.mo6517();
                    c1159.m4637();
                    try {
                        cursorRawQuery = c1159.m2463().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    c5581 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((C5580) ((C4102) C3117.m5718(C5580.m9403(), cursorRawQuery.getBlob(0))).m1977(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair = pairCreate;
                                        } catch (IOException e) {
                                            C3610 c3611 = c5372.f17717;
                                            C5371.m9020(c3611);
                                            j = 0;
                                            try {
                                                c3611.f12020.m9431("Failed to merge main event. appId, eventId", C3610.m6440(str), l, e);
                                            } catch (SQLiteException e2) {
                                                e = e2;
                                                C3610 c3612 = c5372.f17717;
                                                C5371.m9020(c3612);
                                                c3612.f12020.m9430(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                r0 = c5581;
                                                if (r0 != 0) {
                                                }
                                                C3610 c3613 = c5371.f17717;
                                                C5371.m9020(c3613);
                                                c3613.f12025.m9434(str2, l, "Extra parameter without existing main event. eventName, eventId");
                                                return c5581;
                                            }
                                            cursorRawQuery.close();
                                            r0 = c5581;
                                        }
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        j = 0;
                                        C3610 c3614 = c5372.f17717;
                                        C5371.m9020(c3614);
                                        c3614.f12020.m9430(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        r0 = c5581;
                                    }
                                } else {
                                    C3610 c3615 = c5372.f17717;
                                    C5371.m9020(c3615);
                                    c3615.f12023.m9432("Main event not found");
                                    cursorRawQuery.close();
                                    pair = null;
                                    c5581 = null;
                                }
                                j = 0;
                                r0 = pair;
                            } catch (Throwable th) {
                                th = th;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            c5581 = null;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        c5581 = null;
                        j = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = null;
                    }
                    if (r0 != 0 || (obj = ((Pair) r0).first) == null) {
                        C3610 c3616 = c5371.f17717;
                        C5371.m9020(c3616);
                        c3616.f12025.m9434(str2, l, "Extra parameter without existing main event. eventName, eventId");
                        return c5581;
                    }
                    this.f2295 = (C5580) obj;
                    this.f2296 = ((Long) ((Pair) r0).second).longValue();
                    c5034.m8505();
                    this.f2294 = (Long) C3117.m5702("_eid", (C5580) this.f2295);
                } else {
                    j = 0;
                }
                long j2 = this.f2296 - 1;
                this.f2296 = j2;
                if (j2 <= j) {
                    C1159 c11510 = c5034.f16670;
                    C5034.m8484(c11510);
                    C5371 c5373 = (C5371) c11510.f18660;
                    c11510.mo6517();
                    C3610 c3617 = c5373.f17717;
                    C5371.m9020(c3617);
                    c3617.f12023.m9430(str, "Clearing complex main event info. appId");
                    try {
                        c11510.m2463().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e6) {
                        C3610 c3618 = c5373.f17717;
                        C5371.m9020(c3618);
                        c3618.f12020.m9430(e6, "Error clearing complex main event");
                    }
                } else {
                    C1159 c11511 = c5034.f16670;
                    C5034.m8484(c11511);
                    c11511.m2445(str, l, this.f2296, (C5580) this.f2295);
                }
                ArrayList arrayList = new ArrayList();
                for (C5057 c5057 : ((C5580) this.f2295).m9411()) {
                    c5034.m8505();
                    if (C3117.m5697(c5057.m8588(), c5580) == null) {
                        arrayList.add(c5057);
                    }
                }
                if (arrayList.isEmpty()) {
                    C3610 c3619 = c5371.f17717;
                    C5371.m9020(c3619);
                    c3619.f12025.m9430(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listM9411);
                    listM9411 = arrayList;
                }
                strM9415 = str2;
            } else {
                this.f2294 = l;
                this.f2295 = c5580;
                c5034.m8505();
                C5057 c5057M5699 = C3117.m5697("_epc", c5580);
                Serializable serializableM5708 = c5057M5699 != null ? C3117.m5708(c5057M5699) : null;
                long jLongValue = ((Long) (serializableM5708 != null ? serializableM5708 : 0L)).longValue();
                this.f2296 = jLongValue;
                if (jLongValue <= 0) {
                    C3610 c36110 = c5371.f17717;
                    C5371.m9020(c36110);
                    c36110.f12025.m9430(strM9415, "Complex event with zero extra param count. eventName");
                } else {
                    C1159 c11512 = c5034.f16670;
                    C5034.m8484(c11512);
                    c11512.m2445(str, l, this.f2296, c5580);
                }
            }
        }
        C4102 c4102 = (C4102) c5580.m8829();
        c4102.m7290(strM9415);
        c4102.m1979();
        ((C5580) c4102.f3388).m9424();
        c4102.m1979();
        ((C5580) c4102.f3388).m9422(listM9411);
        return (C5580) c4102.m1977();
    }

    /* JADX INFO: renamed from: ۥۗ */
    public int m1380(C3641 c3641, long j) {
        byte[] bArr = AbstractC4031.f13451;
        ArrayList arrayList = c3641.f12191;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c3641.f12181.f13868.f11486 + " was leaked. Did you forget to close a response body?";
                C3216 c3216 = C3216.f10772;
                C3216.f10772.mo5907(((C1731) reference).f5760, str);
                arrayList.remove(i);
                c3641.f12186 = true;
                if (arrayList.isEmpty()) {
                    c3641.f12180 = j - this.f2296;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0029 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x002e A[SYNTHETIC] */
    /* JADX INFO: renamed from: ۥۣ */
    public boolean m1381(C3462 c3462, C0201 c0201, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.f2297).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            C3641 c3641 = (C3641) it.next();
            synchronized (c3641) {
                if (z) {
                    try {
                        if (!(c3641.f12189 != null)) {
                            continue;
                        } else if (c3641.m6507(c3462, arrayList)) {
                            c0201.m462(c3641);
                            return true;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (c3641.m6507(c3462, arrayList)) {
                    c0201.m462(c3641);
                    return true;
                }
            }
        }
    }

    public /* synthetic */ C0615(C1419 c1419) {
        this.f2297 = c1419;
    }
}
