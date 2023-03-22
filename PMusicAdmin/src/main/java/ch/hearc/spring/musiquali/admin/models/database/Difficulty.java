
package ch.hearc.spring.musiquali.admin.models.database;

public enum Difficulty
	{

EASY(0), //
MEDIUM(1), //
ADVANCED(2), //
EXTREME(3);

	/*------------------------------------------------------------------*\
	|*							Constructeurs							*|
	\*------------------------------------------------------------------*/

	private Difficulty(Integer id)
		{
		// Input
			{
			this.id = Integer.valueOf(id);
			}
		}

	/*------------------------------------------------------------------*\
	|*							Methodes Public							*|
	\*------------------------------------------------------------------*/

	/*------------------------------*\
	|*				Get				*|
	\*------------------------------*/

	public Integer getId()
		{
		return this.id;
		}

	/*------------------------------------------------------------------*\
	|*							Attributs Private						*|
	\*------------------------------------------------------------------*/

	// Input
	private Integer id;
	}
