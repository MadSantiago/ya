package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: ۦٕؖؔۜ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public final class C3352 {

    /* JADX INFO: renamed from: ۥؗ */
    public final C0461 f11207;

    /* JADX INFO: renamed from: ۥُ */
    public final List f11208;

    /* JADX INFO: renamed from: ۥّ */
    public final InterfaceC3391 f11209;

    /* JADX INFO: renamed from: ۥۗ */
    public boolean f11210;

    /* JADX INFO: renamed from: ۥۣ */
    public boolean f11211;

    /* JADX INFO: renamed from: ۦؑ */
    public final AbstractC4105 f11212;

    /* JADX INFO: renamed from: ۦۙ */
    public C0956 f11213;

    public C3352(C0461 c0461, AbstractC4105 abstractC4105) {
        int i;
        C3968 c3968;
        int i2 = c0461.f1673;
        InterfaceC3562 interfaceC3562 = c0461.f1660;
        this.f11207 = c0461;
        this.f11212 = abstractC4105;
        List list = c0461.f1661;
        this.f11208 = list == null ? C2340.f7777 : list;
        InterfaceC5138 interfaceC5138 = c0461.f1663;
        if (interfaceC5138 != null) {
            String str = c0461.f1664;
            int i3 = 10;
            if (str == null) {
                c3968 = new C3968(new C5002(i3, this, interfaceC5138));
            } else {
                C5002 c5002 = new C5002(i3, this, interfaceC5138);
                int iM6632 = AbstractC3761.m6632(i2);
                if (iM6632 == 1) {
                    i = 1;
                } else {
                    if (iM6632 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + AbstractC5078.m8671(i2) + '\'').toString());
                    }
                    i = 4;
                }
                int iM6633 = AbstractC3761.m6632(i2);
                if (iM6633 != 1 && iM6633 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + AbstractC5078.m8671(i2) + '\'').toString());
                }
                c3968 = new C3968(c5002, str, i);
            }
            this.f11209 = c3968;
        } else {
            if (interfaceC3562 == null) {
                C1078.m2272("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            this.f11209 = new C4945(new C3121(23, interfaceC3562.mo6355(new C3619(c0461.f1666, c0461.f1664, new C0322(this, abstractC4105.f13695), false, false))));
        }
        boolean z = i2 == 3;
        InterfaceC2488 interfaceC2488M6116 = m6116();
        if (interfaceC2488M6116 != null) {
            interfaceC2488M6116.setWriteAheadLoggingEnabled(z);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m6115(InterfaceC3879 interfaceC3879) {
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("PRAGMA busy_timeout");
        try {
            interfaceC0252Mo971.mo533();
            long j = interfaceC0252Mo971.getLong(0);
            AbstractC1434.m3052(interfaceC0252Mo971, null);
            if (j < 3000) {
                C4773.m8153(interfaceC3879, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1434.m3052(interfaceC0252Mo971, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۥؗ */
    public final InterfaceC2488 m6116() {
        InterfaceC3391 interfaceC3391 = this.f11209;
        C4945 c4945 = interfaceC3391 instanceof C4945 ? (C4945) interfaceC3391 : null;
        if (c4945 != null) {
            return (InterfaceC2488) c4945.f16365.f10451;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[LOOP:4: B:9:0x0018->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0023  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0031  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0066  */
    /* JADX INFO: renamed from: ۥُ */
    public final void m6117(InterfaceC3879 interfaceC3879, int i, int i2) {
        Iterable iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        C3869 c3869;
        Iterator it;
        boolean z;
        int iIntValue;
        TreeMap treeMap2;
        C0461 c0461 = this.f11207;
        C3066 c3066 = c0461.f1667;
        if (i == i2) {
            iterable = C2340.f7777;
        } else {
            boolean z2 = i2 > i;
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            while (true) {
                if (z2) {
                    if (i3 < i2) {
                        linkedHashMap = c3066.f10306;
                        if (z2) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap2 == null) {
                                c3869 = null;
                            } else {
                                c3869 = new C3869(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                            if (treeMap == null) {
                                c3869 = null;
                            } else {
                                c3869 = new C3869(treeMap, treeMap.keySet());
                            }
                        }
                        if (c3869 == null) {
                            Map map = (Map) c3869.f12915;
                            it = ((Iterable) c3869.f12914).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (!z2) {
                                    if (i2 <= iIntValue && iIntValue < i3) {
                                        arrayList.add(map.get(Integer.valueOf(iIntValue)));
                                        z = true;
                                        i3 = iIntValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= iIntValue && iIntValue <= i2) {
                                    arrayList.add(map.get(Integer.valueOf(iIntValue)));
                                    z = true;
                                    i3 = iIntValue;
                                    break;
                                }
                            }
                            if (!z) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                } else if (i3 > i2) {
                    linkedHashMap = c3066.f10306;
                    if (z2) {
                        treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 == null) {
                            c3869 = null;
                        } else {
                            c3869 = new C3869(treeMap2, treeMap2.descendingKeySet());
                        }
                    } else {
                        treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap == null) {
                            c3869 = null;
                        } else {
                            c3869 = new C3869(treeMap, treeMap.keySet());
                        }
                    }
                    if (c3869 == null) {
                        Map map2 = (Map) c3869.f12915;
                        it = ((Iterable) c3869.f12914).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                z = false;
                                break;
                                break;
                            }
                            iIntValue = ((Number) it.next()).intValue();
                            if (!z2) {
                                if (i3 + 1 <= iIntValue) {
                                    continue;
                                }
                            } else if (i2 <= iIntValue) {
                                continue;
                            }
                        }
                        if (!z) {
                        }
                    }
                    iterable = null;
                } else {
                    iterable = arrayList;
                }
            }
        }
        AbstractC4105 abstractC4105 = this.f11212;
        if (iterable != null) {
            abstractC4105.mo1686(interfaceC3879);
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                ((AbstractC4383) it2.next()).mo7578(interfaceC3879);
            }
            C0946 c0946Mo1690 = abstractC4105.mo1690(interfaceC3879);
            if (!c0946Mo1690.f3352) {
                C0178.m383(c0946Mo1690.f3351, "Migration didn't properly handle: ");
                return;
            } else {
                abstractC4105.mo1685();
                m6121(interfaceC3879);
                return;
            }
        }
        if (AbstractC0186.m418(c0461, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (c0461.f1675) {
            InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                C3251 c3251M4189 = AbstractC2164.m4189();
                while (interfaceC0252Mo971.mo533()) {
                    String strMo534 = interfaceC0252Mo971.mo534(0);
                    if (!strMo534.startsWith("sqlite_") && !strMo534.equals("android_metadata")) {
                        c3251M4189.add(new C3869(strMo534, Boolean.valueOf(AbstractC3831.m6874(interfaceC0252Mo971.mo534(1), "view"))));
                    }
                }
                C3251 c3251M4187 = AbstractC2164.m4187(c3251M4189);
                AbstractC1434.m3052(interfaceC0252Mo971, null);
                ListIterator listIterator = c3251M4187.listIterator(0);
                while (true) {
                    C3740 c3740 = (C3740) listIterator;
                    if (!c3740.hasNext()) {
                        break;
                    }
                    C3869 c38610 = (C3869) c3740.next();
                    String str = (String) c38610.f12915;
                    if (((Boolean) c38610.f12914).booleanValue()) {
                        C4773.m8153(interfaceC3879, "DROP VIEW IF EXISTS " + str);
                    } else {
                        C4773.m8153(interfaceC3879, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1434.m3052(interfaceC0252Mo971, th);
                    throw th2;
                }
            }
        } else {
            abstractC4105.mo1687(interfaceC3879);
        }
        Iterator it3 = this.f11208.iterator();
        while (it3.hasNext()) {
            ((AbstractC0104) it3.next()).getClass();
        }
        abstractC4105.mo1688(interfaceC3879);
    }

    /* JADX INFO: renamed from: ۥّ */
    public final void m6118(InterfaceC3879 interfaceC3879) throws Throwable {
        Object c4535;
        AbstractC4105 abstractC4105 = this.f11212;
        String str = abstractC4105.f13694;
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = interfaceC0252Mo971.mo533() && interfaceC0252Mo971.getLong(0) != 0;
            AbstractC1434.m3052(interfaceC0252Mo971, null);
            if (z) {
                InterfaceC0252 interfaceC0252Mo972 = interfaceC3879.mo971("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strMo534 = interfaceC0252Mo972.mo533() ? interfaceC0252Mo972.mo534(0) : null;
                    AbstractC1434.m3052(interfaceC0252Mo972, null);
                    if (!str.equals(strMo534) && !abstractC4105.f13693.equals(strMo534)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + str + ", found: " + strMo534).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC1434.m3052(interfaceC0252Mo972, th);
                        throw th2;
                    }
                }
            } else {
                C4773.m8153(interfaceC3879, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    C0946 c0946Mo1690 = abstractC4105.mo1690(interfaceC3879);
                    if (!c0946Mo1690.f3352) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + c0946Mo1690.f3351).toString());
                    }
                    abstractC4105.mo1685();
                    m6121(interfaceC3879);
                    c4535 = C2358.f7817;
                    if (!(c4535 instanceof C4535)) {
                        C4773.m8153(interfaceC3879, "END TRANSACTION");
                    }
                    Throwable thM405 = AbstractC0183.m405(c4535);
                    if (thM405 != null) {
                        C4773.m8153(interfaceC3879, "ROLLBACK TRANSACTION");
                        throw thM405;
                    }
                } catch (Throwable th3) {
                    c4535 = new C4535(th3);
                }
            }
            abstractC4105.mo1689(interfaceC3879);
            for (AbstractC0104 abstractC0104 : this.f11208) {
                abstractC0104.getClass();
                if (interfaceC3879 instanceof C0448) {
                    abstractC0104.mo192(((C0448) interfaceC3879).f1637);
                }
            }
            this.f11211 = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                AbstractC1434.m3052(interfaceC0252Mo971, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: ۥۗ */
    public final void m6119(InterfaceC3879 interfaceC3879) throws Throwable {
        Object c4535;
        int i = this.f11212.f13695;
        C0461 c0461 = this.f11207;
        if (c0461.f1673 == 3) {
            C4773.m8153(interfaceC3879, "PRAGMA journal_mode = WAL");
        } else {
            C4773.m8153(interfaceC3879, "PRAGMA journal_mode = TRUNCATE");
        }
        if (c0461.f1673 == 3) {
            C4773.m8153(interfaceC3879, "PRAGMA synchronous = NORMAL");
        } else {
            C4773.m8153(interfaceC3879, "PRAGMA synchronous = FULL");
        }
        m6115(interfaceC3879);
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("PRAGMA user_version");
        try {
            interfaceC0252Mo971.mo533();
            int i2 = (int) interfaceC0252Mo971.getLong(0);
            AbstractC1434.m3052(interfaceC0252Mo971, null);
            if (i2 != i) {
                C4773.m8153(interfaceC3879, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i2 == 0) {
                        m6120(interfaceC3879);
                    } else {
                        m6117(interfaceC3879, i2, i);
                    }
                    C4773.m8153(interfaceC3879, "PRAGMA user_version = " + i);
                    c4535 = C2358.f7817;
                } catch (Throwable th) {
                    c4535 = new C4535(th);
                }
                if (!(c4535 instanceof C4535)) {
                    C4773.m8153(interfaceC3879, "END TRANSACTION");
                }
                Throwable thM405 = AbstractC0183.m405(c4535);
                if (thM405 != null) {
                    C4773.m8153(interfaceC3879, "ROLLBACK TRANSACTION");
                    throw thM405;
                }
            }
            m6118(interfaceC3879);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC1434.m3052(interfaceC0252Mo971, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m6120(InterfaceC3879 interfaceC3879) {
        InterfaceC0252 interfaceC0252Mo971 = interfaceC3879.mo971("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (interfaceC0252Mo971.mo533() && interfaceC0252Mo971.getLong(0) == 0) {
                z = true;
            }
            AbstractC1434.m3052(interfaceC0252Mo971, null);
            AbstractC4105 abstractC4105 = this.f11212;
            abstractC4105.mo1688(interfaceC3879);
            if (!z) {
                C0946 c0946Mo1690 = abstractC4105.mo1690(interfaceC3879);
                if (!c0946Mo1690.f3352) {
                    C0178.m383(c0946Mo1690.f3351, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            m6121(interfaceC3879);
            abstractC4105.mo1684();
            Iterator it = this.f11208.iterator();
            while (it.hasNext()) {
                ((AbstractC0104) it.next()).getClass();
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1434.m3052(interfaceC0252Mo971, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m6121(InterfaceC3879 interfaceC3879) {
        C4773.m8153(interfaceC3879, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        C4773.m8153(interfaceC3879, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.f11212.f13694 + "')");
    }

    public C3352(C0461 c0461, C1797 c1797) {
        this.f11207 = c0461;
        this.f11212 = new C1592(-1, "", "");
        List list = c0461.f1661;
        C2340 c2340 = C2340.f7777;
        this.f11208 = list == null ? c2340 : list;
        AbstractC0973.m2046(list == null ? c2340 : list, new C5357(new C4884(0, this)));
        throw new C1345();
    }
}
