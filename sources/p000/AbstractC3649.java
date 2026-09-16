package p000;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۦًُؒٙ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-0d494f8b6d83be2bf58e981e38c510150c6d0fab5a67cb4d4c794ec6fd37749a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3649 extends AbstractC3872 {
    /* JADX INFO: renamed from: ۥٝ */
    public static Object m6528(AbstractList abstractList) {
        if (!abstractList.isEmpty()) {
            return abstractList.remove(AbstractC2164.m4181(abstractList));
        }
        C0178.m384("List is empty.");
        return null;
    }

    /* JADX INFO: renamed from: ۦؒ */
    public static void m6529(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }
}
