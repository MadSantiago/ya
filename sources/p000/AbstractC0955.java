package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: ۥًٍؕؑ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0955 implements Cloneable {

    /* JADX INFO: renamed from: ۦ۟ */
    public AbstractC5212 f3388;

    /* JADX INFO: renamed from: ۦۨ */
    public final AbstractC5212 f3389;

    public AbstractC0955(AbstractC5212 abstractC5212) {
        this.f3389 = abstractC5212;
        if (abstractC5212.m8824()) {
            C1078.m2272("Default instance must be immutable.");
            throw null;
        }
        this.f3388 = abstractC5212.m8831();
    }

    /* JADX INFO: renamed from: ۥؗ */
    public static void m1974(Iterable iterable, List list) {
        iterable.getClass();
        if (iterable instanceof InterfaceC3058) {
            List listM5661 = ((InterfaceC3058) iterable).m5661();
            if (list != null) {
                C0178.m382();
                return;
            }
            list.size();
            Iterator it = listM5661.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof AbstractC4314) {
                    throw null;
                }
                if (!(next instanceof byte[])) {
                    throw null;
                }
                byte[] bArr = (byte[]) next;
                AbstractC4314.m7597(bArr, 0, bArr.length);
                throw null;
            }
            return;
        }
        if (iterable instanceof InterfaceC3215) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C3623) {
                C3623 c3623 = (C3623) list;
                int i = c3623.f12077 + size;
                int length = c3623.f12078.length;
                if (i > length) {
                    if (length != 0) {
                        while (length < i) {
                            length = Math.max(((length * 3) / 2) + 1, 10);
                        }
                        c3623.f12078 = Arrays.copyOf(c3623.f12078, length);
                    } else {
                        c3623.f12078 = new Object[Math.max(i, 10)];
                    }
                }
            }
        }
        int size2 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj : iterable) {
                if (obj == null) {
                    m1975(size2, list);
                    throw null;
                }
                list.add(obj);
            }
            return;
        }
        List list2 = (List) iterable;
        int size3 = list2.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object obj2 = list2.get(i2);
            if (obj2 == null) {
                m1975(size2, list);
                throw null;
            }
            list.add(obj2);
        }
    }

    /* JADX INFO: renamed from: ۥۣ */
    public static void m1975(int i, List list) {
        int size = list.size() - i;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    /* JADX INFO: renamed from: ۥُ, reason: merged with bridge method [inline-methods] */
    public final AbstractC0955 clone() {
        AbstractC0955 abstractC0955 = (AbstractC0955) this.f3389.mo554(5);
        boolean zM8824 = this.f3388.m8824();
        AbstractC5212 abstractC5212 = this.f3388;
        if (zM8824) {
            abstractC5212.getClass();
            C4946.f16366.m8330(abstractC5212.getClass()).mo1654(abstractC5212);
            abstractC5212.m8825();
            abstractC5212 = this.f3388;
        }
        abstractC0955.f3388 = abstractC5212;
        return abstractC0955;
    }

    /* JADX INFO: renamed from: ۥّ */
    public final AbstractC5212 m1977() {
        boolean zM8824 = this.f3388.m8824();
        AbstractC5212 abstractC5212 = this.f3388;
        if (zM8824) {
            abstractC5212.getClass();
            C4946.f16366.m8330(abstractC5212.getClass()).mo1654(abstractC5212);
            abstractC5212.m8825();
            abstractC5212 = this.f3388;
        }
        abstractC5212.getClass();
        if (AbstractC5212.m8823(abstractC5212, true)) {
            return abstractC5212;
        }
        throw new C5515();
    }

    /* JADX INFO: renamed from: ۥۜ */
    public final void m1978(byte[] bArr, int i, C2955 c2955) throws C5463 {
        if (!this.f3388.m8824()) {
            AbstractC5212 abstractC5212M8831 = this.f3389.m8831();
            C4946.f16366.m8330(abstractC5212M8831.getClass()).mo1646(abstractC5212M8831, this.f3388);
            this.f3388 = abstractC5212M8831;
        }
        try {
            C4946.f16366.m8330(this.f3388.getClass()).mo1653(this.f3388, bArr, 0, i, new C0958(c2955));
        } catch (IndexOutOfBoundsException unused) {
            C2316.m4358("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        } catch (C5463 e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        }
    }

    /* JADX INFO: renamed from: ۦؑ */
    public final void m1979() {
        if (this.f3388.m8824()) {
            return;
        }
        AbstractC5212 abstractC5212M8831 = this.f3389.m8831();
        C4946.f16366.m8330(abstractC5212M8831.getClass()).mo1646(abstractC5212M8831, this.f3388);
        this.f3388 = abstractC5212M8831;
    }

    /* JADX INFO: renamed from: ۦۙ */
    public final void m1980(AbstractC5212 abstractC5212) {
        AbstractC5212 abstractC5213 = this.f3389;
        if (abstractC5213.equals(abstractC5212)) {
            return;
        }
        if (!this.f3388.m8824()) {
            AbstractC5212 abstractC5212M8831 = abstractC5213.m8831();
            C4946.f16366.m8330(abstractC5212M8831.getClass()).mo1646(abstractC5212M8831, this.f3388);
            this.f3388 = abstractC5212M8831;
        }
        AbstractC5212 abstractC5214 = this.f3388;
        C4946.f16366.m8330(abstractC5214.getClass()).mo1646(abstractC5214, abstractC5212);
    }
}
