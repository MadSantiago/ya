package p000;

import android.content.Context;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ۦؙۣؒ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3134 {

    /* JADX INFO: renamed from: ۥۣ */
    public final C3990 f10553;

    /* JADX INFO: renamed from: ۥۗ */
    public static final C3637 f10551 = new C3637("fire-global");

    /* JADX INFO: renamed from: ۥؗ */
    public static final C3637 f10550 = new C3637("fire-count");

    /* JADX INFO: renamed from: ۦؑ */
    public static final C3637 f10552 = new C3637("last-used-date");

    public C3134(Context context, String str) {
        this.f10553 = new C3990(context, "FirebaseHeartBeat".concat(str));
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static C3637 m5814(C1337 c1337, String str) {
        for (Map.Entry entry : c1337.m2851().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return new C3637(((C3637) entry.getKey()).f12167);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۗ */
    public static String m5815(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: ۥۣ */
    public final synchronized ArrayList m5816() {
        try {
            ArrayList arrayList = new ArrayList();
            String strM5815 = m5815(System.currentTimeMillis());
            InterfaceC0443 interfaceC0443 = null;
            for (Map.Entry entry : ((Map) AbstractC5537.m9243(C4794.f15814, new C2718(this.f10553, interfaceC0443, 4))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strM5815);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new C4091(((C3637) entry.getKey()).f12167, new ArrayList(hashSet)));
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }
}
